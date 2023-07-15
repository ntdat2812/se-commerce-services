package com.secommerce.customer.grpc;


import com.secommerce.common.constant.SeConstant;
import com.secommerce.common.exception.SeException;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class GrpcService {

    @Autowired
    private DiscoveryClient discoveryClient;

    public CustomerGrpc.Customers getCustomersGrpc() {
        ManagedChannel channel = this.getChannel();

        SeGrpcServiceGrpc.SeGrpcServiceBlockingStub stub = SeGrpcServiceGrpc.newBlockingStub(channel);

        CustomerGrpc.GetCustomersReq request = CustomerGrpc.
                GetCustomersReq.newBuilder().build();

        return stub.getCustomers(request);
    }

    public ManagedChannel getChannel() {
        List<ServiceInstance> instances = discoveryClient.getInstances(SeConstant.Service.GRPC_SERVICE);
        if (instances == null || instances.size() == 0) {
            log.error("no grpc service instances");
            throw new SeException(HttpStatus.INTERNAL_SERVER_ERROR, "no grpc service available");
        }

        ServiceInstance instance = instances.get(0);

        return ManagedChannelBuilder.forAddress(instance.getHost(), instance.getPort())
                .usePlaintext()
                .build();
    }

}

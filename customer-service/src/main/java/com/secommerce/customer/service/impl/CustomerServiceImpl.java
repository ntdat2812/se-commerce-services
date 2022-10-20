package com.secommerce.customer.service.impl;

import com.secommerce.customer.grpc.CustomerGrpc;
import com.secommerce.customer.grpc.GrpcService;
import com.secommerce.customer.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {


    private final GrpcService grpcService;


    @Override
    public List<Object> getCustomers() {
        List<Object> result = new ArrayList<>();

        CustomerGrpc.Customers customersGrpc = grpcService.getCustomersGrpc();
        customersGrpc.getCustomersList().forEach(customer -> {
            Map<String, Object> c = Map.of(
                    "name", customer.getFirstName() + customer.getLastName(),
                    "email", customer.getEmail()
            );
            result.add(c);
        });

        return result;
    }
}

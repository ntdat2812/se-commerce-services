package com.secommerce.customer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping
    public ResponseEntity<Object> test() {


        List<ServiceInstance> orders = discoveryClient.getInstances("order-service");
        List<ServiceInstance> customers = discoveryClient.getInstances("customer-service");
        List<ServiceInstance> products = discoveryClient.getInstances("product-service");

        Map<String, List<ServiceInstance>> services = Map.of(
                "order-service", orders,
                "customer-service", customers,
                "product-service", products
        );


        return ResponseEntity.ok(services);
    }
}

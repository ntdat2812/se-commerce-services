package com.secommerce.customer.controller;


import com.secommerce.customer.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
@AllArgsConstructor
public class  CustomerController {


    private final CustomerService customerService;

    @GetMapping
    public ResponseEntity<Object> getCustomers() {
        return ResponseEntity.ok(customerService.getCustomers());
    }
}

package com.secommerce.product.controller;


import com.secommerce.common.response.SeResponse;
import com.secommerce.product.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {

    private final ProductService service;

    @GetMapping
    public ResponseEntity<SeResponse> test() {

        throw new IllegalStateException("test");
    }

    @GetMapping("info/{id}")
    public ResponseEntity<SeResponse> getProductInfo(@PathVariable @NotNull Long id){

        return new ResponseEntity<>(SeResponse.SUCCESS.withResult(service.getProductInfo(id)), HttpStatus.OK);
    }
}

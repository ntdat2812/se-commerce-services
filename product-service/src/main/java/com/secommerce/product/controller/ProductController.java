package com.secommerce.product.controller;


import com.secommerce.common.response.SeResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {


    @GetMapping
    public ResponseEntity<SeResponse> test() {

        throw new IllegalStateException("test");
    }
}

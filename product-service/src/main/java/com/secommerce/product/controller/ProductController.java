package com.secommerce.product.controller;


import com.secommerce.common.response.SeResponse;
import com.secommerce.product.dto.request.product.CreateProductDTO;
import com.secommerce.product.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;


    @GetMapping("/{id}")
    public ResponseEntity<SeResponse> getProductInfo(@PathVariable @NotNull Long id) {

        return new ResponseEntity<>(SeResponse.SUCCESS.withResult(productService.getProductInfo(id)), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<SeResponse> create(@Valid @RequestBody CreateProductDTO req) {

        productService.create(req);

        return new ResponseEntity<>(SeResponse.SUCCESS, HttpStatus.OK);
    }
}

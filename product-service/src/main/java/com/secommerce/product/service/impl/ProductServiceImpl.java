package com.secommerce.product.service.impl;

import com.secommerce.product.dto.request.product.CreateProductDTO;
import com.secommerce.product.entity.Product;
import com.secommerce.product.repository.product.ProductRepository;
import com.secommerce.product.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@AllArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product getProductInfo(Long id) {
        return productRepository.getReferenceById(id);
    }

    @Override
    public boolean create(CreateProductDTO req) {
        log.info("vao day");



        return true;
    }
}

package com.secommerce.product.service.impl;

import com.secommerce.product.entity.Product;
import com.secommerce.product.repository.product.ProductRepository;
import com.secommerce.product.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    @Override
    public Product getProductInfo(Long id) {
        return repository.getReferenceById(id);
    }
}

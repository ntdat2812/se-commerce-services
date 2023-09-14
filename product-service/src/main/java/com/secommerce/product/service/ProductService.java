package com.secommerce.product.service;

import com.secommerce.product.dto.request.product.CreateProductDTO;
import com.secommerce.product.entity.Product;

public interface ProductService {

    Product getProductInfo(Long id);

    boolean create(CreateProductDTO req);
}

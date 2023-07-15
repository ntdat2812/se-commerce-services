package com.secommerce.product.repository.product;

import com.secommerce.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>, ICustomProductRepository, JpaSpecificationExecutor<Product> {
}

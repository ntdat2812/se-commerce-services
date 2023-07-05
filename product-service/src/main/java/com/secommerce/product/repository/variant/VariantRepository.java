package com.secommerce.product.repository.variant;

import com.secommerce.product.entity.ProductVariant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VariantRepository extends JpaRepository<ProductVariant, Long> {
}

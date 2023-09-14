package com.secommerce.product.repository.variant;

import com.secommerce.product.entity.Variant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VariantRepository extends JpaRepository<Variant, Long> {
}

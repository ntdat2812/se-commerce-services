package com.secommerce.product.entity;

import com.secommerce.common.entity.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Variant extends BaseEntity {

    private String name;

    private Integer quantity;

    private Double price;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

}

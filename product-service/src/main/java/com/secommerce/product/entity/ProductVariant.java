package com.secommerce.product.entity;

import javax.persistence.*;

@Entity
public class ProductVariant {
    /* ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /* Combination string of variant */
    private String combination;

    /* Price of combination variant */
    @Column(columnDefinition="Decimal(10,2)")
    private Double price;

    /* Product */
    @ManyToOne
    Product product;
}

package com.secommerce.product.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Attribute {
    /* ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private AttributeType attributeType;

    private String value;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Product product;
}

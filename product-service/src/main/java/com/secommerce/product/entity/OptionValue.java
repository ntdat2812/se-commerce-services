package com.secommerce.product.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class OptionValue {
    /* Option value ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /* Option value */
    String value;

    /* Variant option */
    @ManyToOne
    VariantOption option;
}

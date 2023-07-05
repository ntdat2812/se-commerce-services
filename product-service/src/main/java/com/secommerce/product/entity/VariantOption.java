package com.secommerce.product.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class VariantOption {
    /* Variant option ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /* Variant option name */
    private String name;

    /* Variant option value set */
    @OneToMany(mappedBy = "option", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY, orphanRemoval = true)
    @OrderBy(value = "id asc")
    private Set<OptionValue> valueSet;

    @ManyToOne
    private Product product;
}


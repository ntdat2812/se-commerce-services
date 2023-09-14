package com.secommerce.product.entity;

import com.secommerce.common.entity.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Product extends BaseEntity {

    @Column(unique = true)
    private String sku;

    private String title;

    private String content;

    private String description;

    private String thumbnailImage;

    private Integer views;


    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Variant> variants = new ArrayList<>();

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "product_option", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "option_id"))
    private Set<Option> options = new HashSet<>();


    public void addVariant(Variant variant) {
        variants.add(variant);
        variant.setProduct(this);
    }

    public void removeVariant(Variant variant) {
        variants.remove(variant);
        variant.setProduct(null);
    }

    public void addOption(Option option) {
        options.add(option);
        option.getProducts().add(this);
    }

    public void removeOption(Option option) {
        options.remove(option);
        option.getProducts().remove(this);
    }
}

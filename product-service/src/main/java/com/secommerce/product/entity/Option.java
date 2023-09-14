package com.secommerce.product.entity;

import com.secommerce.common.entity.BaseEntity;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Option extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "option", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OptionValue> optionValues = new ArrayList<>();

    @ManyToMany(mappedBy = "options")
    private Set<Product> products = new HashSet<>();

    public void addOptionValue(OptionValue optionValue) {
        optionValues.add(optionValue);
        optionValue.setOption(this);
    }

    public void removeOptionValue(OptionValue optionValue) {
        optionValues.remove(optionValue);
        optionValue.setOption(null);
    }

}

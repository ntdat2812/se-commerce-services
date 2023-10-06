package com.secommerce.product.entity;

import com.secommerce.common.entity.BaseEntity;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Category extends BaseEntity {

    @Column(unique = true)
    private String name;

    private Boolean disable;

    @ManyToOne
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Category parentCategory;

    @OneToMany
    private List<Product> products = new ArrayList<>();


}

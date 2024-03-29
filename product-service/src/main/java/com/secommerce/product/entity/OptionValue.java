package com.secommerce.product.entity;

import com.secommerce.common.entity.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Data
@Entity
public class OptionValue extends BaseEntity {

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private Option option;

}

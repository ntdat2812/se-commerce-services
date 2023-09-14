package com.secommerce.common.dto.product;

import com.secommerce.common.dto.base.BaseDTO;
import com.secommerce.common.dto.option.OptionDTO;
import lombok.Data;

import java.util.Set;

@Data
public class ProductDTO extends BaseDTO {

    private String sku;

    private String title;

    private String content;

    private String description;

    private String thumbnailImage;

    private Integer views;

    private Set<OptionDTO> options;

}

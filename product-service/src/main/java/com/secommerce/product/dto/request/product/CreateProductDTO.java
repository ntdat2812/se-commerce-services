package com.secommerce.product.dto.request.product;

import com.secommerce.common.dto.option.OptionDTO;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Data
public class CreateProductDTO {

    @NotBlank(message = "sku is required")
    private String sku;

    @NotBlank(message = "title is required")
    private String title;

    private String content;

    private String description;

    private String thumbnailImage;

    private Integer views;

    @NotEmpty(message = "product must have at least 1 option")
    private Set<OptionDTO> options;

}

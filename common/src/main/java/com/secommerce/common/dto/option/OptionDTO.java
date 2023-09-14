package com.secommerce.common.dto.option;

import com.secommerce.common.dto.base.BaseDTO;
import lombok.Data;

import java.util.List;

@Data
public class OptionDTO extends BaseDTO {

    private String name;

    private List<OptionValueDTO> optionValues;
}

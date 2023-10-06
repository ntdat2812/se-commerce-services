package com.secommerce.product.mapper;

import com.secommerce.product.dto.request.product.CreateProductDTO;
import com.secommerce.product.entity.Product;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product createDtoToEntity(CreateProductDTO dto);

}

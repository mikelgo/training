package com.prodyna.training.mapstruct.test;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {

  ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

  Product toProduct(ProductDto productDto);

  @InheritInverseConfiguration
  ProductDto toDto(Product product);



}

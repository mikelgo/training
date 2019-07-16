package com.prodyna.training.mapstruct.test;

import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@EqualsAndHashCode
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BrandDto implements Serializable {

  private String brandId;

  private String brandName;

  private List<ProductDto> offersProducts;

}

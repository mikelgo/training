package com.prodyna.training.mapstruct.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsCollectionContaining.hasItem;

import com.google.common.collect.Lists;
import org.hamcrest.core.IsCollectionContaining;
import org.junit.Test;

public class BrandMapperTest {

  @Test
  public void testMapEntityToDto(){

      Brand brand = Brand.builder().id(1).name("Audi").products(
          Lists.newArrayList(
            Product.builder().id(11).description("a4").onSale(true).build(),
            Product.builder().id(12).description("a5").onSale(false).build()
          )
      ).build();

      BrandDto brandDto = BrandMapper.INSTANCE.toDto(brand);

    assertThat( brandDto.getBrandId(), equalTo( "1" ));
    assertThat( brandDto.getBrandName() ,equalTo( "Audi" ));
    assertThat( brandDto.getOffersProducts(),
        hasItem(ProductDto.builder().id(11).description("a4").onSale(true).build()));


  }

}

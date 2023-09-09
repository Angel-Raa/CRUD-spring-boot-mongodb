package com.github.AngelRaa.modules.service.interfaces;

import com.github.AngelRaa.modules.entity.Dto.ProductDto;
import com.github.AngelRaa.modules.utils.ApiResponse;

import java.util.List;

public interface ProductService {
    ProductDto findById(String productId);
    List<ProductDto> findAllProducts();
    ApiResponse delete(String productId);

    ApiResponse save(ProductDto dto);
    ApiResponse update(String productId, ProductDto dto);
    ApiResponse deleteByName(String name);
    List<ProductDto> findAllProductsByName(String name);


}

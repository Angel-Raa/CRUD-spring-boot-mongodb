package com.github.AngelRaa.modules.entity.mapper;

import com.github.AngelRaa.modules.entity.Dto.ProductDto;
import com.github.AngelRaa.modules.entity.model.Product;

public class ProductMapper {
    public static ProductDto toDto(Product product) {
        return new ProductDto(product.getId(), product.getName(), product.getDescription(), product.getPrice());
    }
    public static Product toEntity(ProductDto productDto) {
        Product product = new Product();
        product.setId(product.getId());
        product.setName(product.getName());
        product.setDescription(product.getDescription());
        product.setPrice(product.getPrice());
        return product;
    }
}

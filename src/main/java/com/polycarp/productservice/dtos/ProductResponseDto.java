package com.polycarp.productservice.dtos;

import com.polycarp.productservice.models.Category;
import com.polycarp.productservice.models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDto {
    private Long id;
    private String title;
    private Double price;
    private String description;
    private String imageUrl;
    private String categoryName;

    public static ProductResponseDto from(Product product) {
        ProductResponseDto dto = new ProductResponseDto();
        dto.setId(product.getId());
        dto.setTitle(product.getTitle());
        dto.setPrice(product.getPrice());
        dto.setDescription(product.getDescription());
        dto.setImageUrl(product.getImageUrl());
        dto.setCategoryName(product.getCategory().getName());

        return dto;
    }
}

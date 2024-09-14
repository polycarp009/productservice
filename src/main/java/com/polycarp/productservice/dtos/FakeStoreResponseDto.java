package com.polycarp.productservice.dtos;


import com.polycarp.productservice.models.Category;
import com.polycarp.productservice.models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreResponseDto {

    private Long id;
    private String title;
    private String price;
    private String category;
    private String description;
    private String image;

    public Product toProduct(){
        Product product = new Product();
        product.setId(this.getId());
        product.setTitle(this.getTitle());
        product.setDescription(this.getDescription());
        product.setPrice(Double.valueOf(this.getPrice()));
        product.setImageUrl(this.getImage());
        Category category1 = new Category();
        category1.setName(this.getCategory());
        product.setCategory(category1);
        return product;
    }
}

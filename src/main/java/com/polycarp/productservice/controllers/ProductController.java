package com.polycarp.productservice.controllers;

import com.polycarp.productservice.dtos.ProductResponseDto;
import com.polycarp.productservice.models.Product;
import com.polycarp.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/product/{id}")
    public ProductResponseDto getProductById(@PathVariable("id") String productId) {
        Product product = productService.getProductById(Long.valueOf(productId));

        return ProductResponseDto.from(product);//localhost:8080/product/10;
    }

    @GetMapping("/product")
    public String getAllProducts() {
        System.out.println("Getting all products");
        return "Hello, Welcome to Product";
    }

    public void createProduct() {

    }

    public void deleteProduct() {
    }


}

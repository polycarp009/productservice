package com.polycarp.productservice.services;

import com.polycarp.productservice.models.Product;
import org.springframework.stereotype.Service;

public interface ProductService {
public Product getProductById(Long id);


}

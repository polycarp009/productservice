package com.polycarp.productservice.services;

import com.polycarp.productservice.dtos.FakeStoreResponseDto;
import com.polycarp.productservice.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreProductService implements ProductService {

    private RestTemplate restTemplate;

    @Autowired
    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getProductById(Long id) {

        FakeStoreResponseDto fakeStoreResponseDto = new FakeStoreResponseDto();
        FakeStoreResponseDto responseDto = restTemplate.getForObject(
                "https://fakestoreapi.com/products/" + id,
                FakeStoreResponseDto.class);
        return responseDto.toProduct();

    }
}

package com.example.demo.service;

import com.example.demo.dto.ProductRequest;
import com.example.demo.dto.ProductResponse;

public interface ProductService {

    ProductResponse addProduct(ProductRequest request);

    ProductResponse getProduct(Long id);

    void deleteProduct(Long id);
}
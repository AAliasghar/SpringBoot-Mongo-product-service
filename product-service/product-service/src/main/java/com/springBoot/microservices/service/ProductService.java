package com.springBoot.microservices.service;

import org.springframework.stereotype.Service;

import com.springBoot.microservices.dto.ProductRequest;
import com.springBoot.microservices.model.Product;
import com.springBoot.microservices.repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
// @RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }


    public void createProduct(ProductRequest productRequest){
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
            productRepository.save(product);
            log.info("Product {} is saved.",product.getId());  //Getting product Id and save in place holder
    }
}

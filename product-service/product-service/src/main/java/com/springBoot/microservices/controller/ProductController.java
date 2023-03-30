package com.springBoot.microservices.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.microservices.dto.ProductRequest;
import com.springBoot.microservices.model.Product;
import com.springBoot.microservices.repository.ProductRepository;
import com.springBoot.microservices.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/product")
//@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository productRepository;
    private final ProductService productService;

    public ProductController(ProductRepository productRepository, ProductService productService){
        this.productRepository = productRepository;
        this.productService = productService;
    }

  
    
    @GetMapping
    public ResponseEntity <List<Product>> findAll(){
        return ResponseEntity.ok(productRepository.findAll());
    }

  
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){
     
        productService.createProduct(productRequest);
    }
     

    
}

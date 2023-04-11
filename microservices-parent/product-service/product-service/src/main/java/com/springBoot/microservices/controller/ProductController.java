package com.springBoot.microservices.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.springBoot.microservices.dto.ProductRequest;
import com.springBoot.microservices.dto.ProductResponse;
import com.springBoot.microservices.service.ProductService;

//import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/product")
//@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    public ProductController( ProductService productService){
        this.productService = productService;
    }

  
    
    @GetMapping
    public  List<ProductResponse> getAllProducts(){
        return productService.getAllProducts();
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){
     
        productService.createProduct(productRequest);
    }
     

    
}

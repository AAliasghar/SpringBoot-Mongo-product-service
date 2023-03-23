package com.springBoot.microservices.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springBoot.microservices.model.Product;

public interface ProductRepository extends MongoRepository<Product,String> {
    
}

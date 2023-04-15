package com.ali.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ali.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {
    
}

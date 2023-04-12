package com.ali.orderservice.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ali.orderservice.dto.OrderRequest;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        return "Order placed successfully";
    }
}

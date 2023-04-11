package com.ali.orderservice.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "t_orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int id;
    private String orderNumber;
    private List<OrderLineItems> orderLineItems;
    
}

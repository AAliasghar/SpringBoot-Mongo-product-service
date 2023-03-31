package com.springBoot.microservices.dto;

import java.math.BigDecimal;



import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
    
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
    
}

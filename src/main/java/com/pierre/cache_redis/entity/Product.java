package com.pierre.cache_redis.entity;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class Product {
    private String sku;
    private String name;
    private BigDecimal price;
    private String category;
    private Boolean active;

    // Constructors, getters, and setters can be generated by Lombok
}

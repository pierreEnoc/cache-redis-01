package com.pierre.cache_redis.repository;

import com.pierre.cache_redis.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Component
@Slf4j
public class ProductRepository {

    public List<Product> ListAllProducts() {
        log.info("c=ProductRepository m=ListAllProducts() - List all products");
       // final Product product1 = new Product("sku1", "Product 1", 10.0, "Category 1", true);
        final Product product1 = Product.builder()
                .sku("sku1")
                .name("Product 1")
                .price(new BigDecimal("20.0"))
                .category("Category 1")
                .active(true)
                .build();
        final Product product2 = Product.builder()
                .sku("sku2")
                .name("Product 2")
                .price(new BigDecimal("20.0"))
                .category("Category 2")
                .active(true)
                .build();

        return List.of(product1, product2);
    }
}

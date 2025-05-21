package com.pierre.cache_redis.resource;


import com.pierre.cache_redis.entity.Product;
import com.pierre.cache_redis.sevice.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
@Slf4j
public class ProductResource {

    private final ProductService productService;

//    public ProductResource(ProductService productService) {
//        this.productService = productService;
//    }

    @GetMapping("/")
    public List<Product> ListAllProducts() {
        log.info("c=ProductResource m=ListAllProducts() - List all products");
        return productService.ListAllProducts();
    }
}

package com.pierre.cache_redis.sevice;

import com.pierre.cache_redis.entity.Product;
import com.pierre.cache_redis.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> ListAllProducts() {
        log.info("c=ProductService m=ListAllProducts() - List all products");
        return productRepository.ListAllProducts();
    }
}

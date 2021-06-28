package com.example.javafinal.api;

import com.example.javafinal.entity.Product;
import com.example.javafinal.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @PostMapping()
    public Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping("/find-all")
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}

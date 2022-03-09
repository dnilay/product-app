package com.example.myapp.controller;

import com.example.myapp.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class ProductController {

    @GetMapping("/products")
    public ResponseEntity<Product> displayProduct()
    {
        return ResponseEntity.ok(Product.builder().productId(UUID.randomUUID().toString()).productName("Pen").price(20).build());
    }
    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(Product product)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }
}

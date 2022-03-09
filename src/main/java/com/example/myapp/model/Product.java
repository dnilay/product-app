package com.example.myapp.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Product {

    private String productId;
    private String productName;
    private double price;
}

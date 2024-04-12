package com.example.auth.authapi.dto;

import com.example.auth.authapi.domain.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ProductResponseDTO {

    public ProductResponseDTO(Product product) {
        this(product.getId(), product.getName(), product.getPrice());
    }

    public ProductResponseDTO(String id, String name, Integer price) {
    }

    private String id;

    private String name;

    private Integer price;

}

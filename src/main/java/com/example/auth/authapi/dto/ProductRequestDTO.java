package com.example.auth.authapi.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NonNull;

@Data
public class ProductRequestDTO {
    @NotBlank
    private String name;

    @NonNull
    private Integer price;
}

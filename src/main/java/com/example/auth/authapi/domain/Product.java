package com.example.auth.authapi.domain;

import com.example.auth.authapi.dto.ProductRequestDTO;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "product")
@Entity(name = "product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {

    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    private String id;

    private String name;

    private Integer price;

    public Product(ProductRequestDTO data){
        this.price = data.getPrice();
        this.name = data.getName();
    }
}

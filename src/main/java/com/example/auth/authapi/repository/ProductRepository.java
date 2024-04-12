package com.example.auth.authapi.repository;

import com.example.auth.authapi.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}

package com.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
}

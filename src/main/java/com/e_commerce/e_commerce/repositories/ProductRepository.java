package com.e_commerce.e_commerce.repositories;

import com.e_commerce.e_commerce.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
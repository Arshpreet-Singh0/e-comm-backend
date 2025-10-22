package com.e_commerce.e_commerce.repositories;

import com.e_commerce.e_commerce.entities.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartEntityRepository extends JpaRepository<CartEntity, Long> {
}
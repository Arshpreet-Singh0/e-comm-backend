package com.e_commerce.e_commerce.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private Long id;

    private String title;

    private String description;

    private BigDecimal price;

    private BigDecimal discount;

    private Integer quantity;

    private String imageUrl;
}

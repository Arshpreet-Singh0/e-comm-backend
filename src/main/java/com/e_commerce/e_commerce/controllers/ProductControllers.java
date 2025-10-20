package com.e_commerce.e_commerce.controllers;

import com.e_commerce.e_commerce.dto.ProductDTO;
import com.e_commerce.e_commerce.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductControllers {
    private final ProductService productService;
    public ProductControllers(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getProducts() {
        return ResponseEntity.ok(productService.findAll());
    }

    @GetMapping(path = "{productId}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable(name = "productId") Long id) {
        return ResponseEntity.ok(productService.findById(id));
    }
}

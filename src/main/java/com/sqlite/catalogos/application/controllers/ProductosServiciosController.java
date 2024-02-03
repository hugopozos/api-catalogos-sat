package com.sqlite.catalogos.application.controllers;

import com.sqlite.catalogos.persistence.entity.ProductosServiciosEntity;
import com.sqlite.catalogos.service.ProductosServiciosService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/productos-servicios")
@RequiredArgsConstructor
public class ProductosServiciosController {

    private final ProductosServiciosService productosServiciosService;

    @GetMapping("/{id}")
    public Optional<ProductosServiciosEntity> findById(String id) {
        return productosServiciosService.findById(id);
    }

    @GetMapping("/all")
    public List<ProductosServiciosEntity> findAll() {
        return productosServiciosService.findAll();
    }
}

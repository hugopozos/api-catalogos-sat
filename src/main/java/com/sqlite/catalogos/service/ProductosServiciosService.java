package com.sqlite.catalogos.service;

import com.sqlite.catalogos.persistence.entity.ProductosServiciosEntity;

import java.util.List;
import java.util.Optional;

public interface ProductosServiciosService {
    Optional<ProductosServiciosEntity> findById(String id);
    List<ProductosServiciosEntity> findAll();
}

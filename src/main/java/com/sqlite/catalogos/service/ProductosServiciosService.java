package com.sqlite.catalogos.service;

import com.sqlite.catalogos.persistence.entity.ProductosServiciosEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ProductosServiciosService {
    Optional<ProductosServiciosEntity> findById(String id);
    Page<ProductosServiciosEntity> findAll(Pageable pageable);
}

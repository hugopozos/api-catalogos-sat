package com.sqlite.catalogos.service.impl;

import com.sqlite.catalogos.persistence.entity.ProductosServiciosEntity;
import com.sqlite.catalogos.persistence.repository.ProductosServiciosRepository;
import com.sqlite.catalogos.service.ProductosServiciosService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductosServicioServiceImpl implements ProductosServiciosService {

    private final ProductosServiciosRepository productosServiciosRepository;

    public Optional<ProductosServiciosEntity> findById(String id) {
        return productosServiciosRepository.findById(id);
    }

    public List<ProductosServiciosEntity> findAll() {
        return productosServiciosRepository.findAll();
    }

}

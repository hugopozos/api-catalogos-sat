package com.sqlite.catalogos.service.impl;

import com.sqlite.catalogos.persistence.entity.MetodosPagoEntity;
import com.sqlite.catalogos.persistence.repository.MetodosPagoRepository;
import com.sqlite.catalogos.service.MetodosPagoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MetodosPagoServiceImpl implements MetodosPagoService {

    private final MetodosPagoRepository metodosPagoRepository;

    public Optional<MetodosPagoEntity> findById(String id) {
        return metodosPagoRepository.findById(id);
    }

    public List<MetodosPagoEntity> findAll() {
        return metodosPagoRepository.findAll();
    }

}

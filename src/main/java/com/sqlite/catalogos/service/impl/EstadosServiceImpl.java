package com.sqlite.catalogos.service.impl;

import com.sqlite.catalogos.service.EstadosService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.sqlite.catalogos.persistence.entity.EstadosEntity;
import com.sqlite.catalogos.persistence.repository.EstadosRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EstadosServiceImpl implements EstadosService {

    private final EstadosRepository estadosRepository;

    public EstadosEntity findById(String id) {
        Optional<EstadosEntity> optional = estadosRepository.findById(id);
        return optional.orElse(null);
    }

    public List<EstadosEntity> findAll() {
        return estadosRepository.findAll();
    }

}

package com.sqlite.catalogos.service.impl;

import com.sqlite.catalogos.persistence.entity.ObjetosImpuestosEntity;
import com.sqlite.catalogos.persistence.repository.ObjetosImpuestosRepository;
import com.sqlite.catalogos.service.ObjetosImpuestosService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ObjetosImpuestosServiceImpl implements ObjetosImpuestosService {

    private final ObjetosImpuestosRepository objetosImpuestosRepository;

    public Optional<ObjetosImpuestosEntity> findById(String id) {
        return objetosImpuestosRepository.findById(id);
    }

    public List<ObjetosImpuestosEntity> findAll() {
        return objetosImpuestosRepository.findAll();
    }

}

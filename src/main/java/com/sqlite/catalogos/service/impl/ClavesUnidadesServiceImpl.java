package com.sqlite.catalogos.service.impl;

import com.sqlite.catalogos.persistence.entity.ClavesUnidadesEntity;
import com.sqlite.catalogos.persistence.repository.ClavesUnidadesRepository;
import com.sqlite.catalogos.service.ClavesUnidadesService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClavesUnidadesServiceImpl implements ClavesUnidadesService {

    private final ClavesUnidadesRepository clavesUnidadesRepository;

    public ClavesUnidadesEntity findById(String id) {
        Optional<ClavesUnidadesEntity> optional = clavesUnidadesRepository.findById(id);
        return optional.orElse(null);
    }

    public Page<ClavesUnidadesEntity> findAll(Pageable pageable) {
        return clavesUnidadesRepository.findAll(pageable);
    }
}

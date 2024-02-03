package com.sqlite.catalogos.service;

import com.sqlite.catalogos.persistence.entity.ClavesUnidadesEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ClavesUnidadesService {
    ClavesUnidadesEntity findById(String id);
    Page<ClavesUnidadesEntity> findAll(Pageable pageable);
}

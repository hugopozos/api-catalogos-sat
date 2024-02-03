package com.sqlite.catalogos.service;

import com.sqlite.catalogos.persistence.entity.ClavesUnidadesEntity;

import java.util.List;

public interface ClavesUnidadesService {
    ClavesUnidadesEntity findById(String id);
    List<ClavesUnidadesEntity> findAll();
}

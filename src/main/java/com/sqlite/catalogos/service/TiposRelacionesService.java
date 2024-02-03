package com.sqlite.catalogos.service;

import com.sqlite.catalogos.persistence.entity.TiposRelacionesEntity;

import java.util.List;

public interface TiposRelacionesService {
    TiposRelacionesEntity findById(String id);
    List<TiposRelacionesEntity> findAll();
}

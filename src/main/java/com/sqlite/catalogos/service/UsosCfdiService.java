package com.sqlite.catalogos.service;

import com.sqlite.catalogos.persistence.entity.UsosCfdiEntity;

import java.util.List;
import java.util.Optional;

public interface UsosCfdiService {
    Optional<UsosCfdiEntity> findById(String id);
    List<UsosCfdiEntity> findAll();
}

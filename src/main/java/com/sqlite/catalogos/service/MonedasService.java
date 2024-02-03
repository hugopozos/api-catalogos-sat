package com.sqlite.catalogos.service;

import com.sqlite.catalogos.persistence.entity.MonedasEntity;

import java.util.List;
import java.util.Optional;

public interface MonedasService {
    Optional<MonedasEntity> findById(String id);
    List<MonedasEntity> findAll();
}

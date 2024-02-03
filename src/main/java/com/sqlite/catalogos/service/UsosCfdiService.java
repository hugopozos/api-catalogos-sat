package com.sqlite.catalogos.service;

import com.sqlite.catalogos.persistence.entity.UsosCfdiEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface UsosCfdiService {
    Optional<UsosCfdiEntity> findById(String id);
    Page<UsosCfdiEntity> findAll(Pageable pageable);
}

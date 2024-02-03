package com.sqlite.catalogos.service;

import com.sqlite.catalogos.persistence.entity.ObjetosImpuestosEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ObjetosImpuestosService {
    Optional<ObjetosImpuestosEntity> findById(String id);
    Page<ObjetosImpuestosEntity> findAll(Pageable pageable);
}

package com.sqlite.catalogos.service;

import com.sqlite.catalogos.persistence.entity.ObjetosImpuestosEntity;

import java.util.List;
import java.util.Optional;

public interface ObjetosImpuestosService {
    Optional<ObjetosImpuestosEntity> findById(String id);
    List<ObjetosImpuestosEntity> findAll();
}

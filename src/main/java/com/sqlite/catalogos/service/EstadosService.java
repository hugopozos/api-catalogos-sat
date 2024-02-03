package com.sqlite.catalogos.service;

import com.sqlite.catalogos.persistence.entity.EstadosEntity;

import java.util.List;

public interface EstadosService {
    EstadosEntity findById(String id);
    List<EstadosEntity> findAll();
}

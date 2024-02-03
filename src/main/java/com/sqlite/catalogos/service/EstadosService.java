package com.sqlite.catalogos.service;

import com.sqlite.catalogos.persistence.entity.EstadosEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EstadosService {
    EstadosEntity findById(String id);
    Page<EstadosEntity> findAll(Pageable pageable);
}

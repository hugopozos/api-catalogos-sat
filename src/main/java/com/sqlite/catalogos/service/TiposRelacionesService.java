package com.sqlite.catalogos.service;

import com.sqlite.catalogos.persistence.entity.TiposRelacionesEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TiposRelacionesService {
    TiposRelacionesEntity findById(String id);
    Page<TiposRelacionesEntity> findAll(Pageable pageable);
}

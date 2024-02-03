package com.sqlite.catalogos.service;

import com.sqlite.catalogos.persistence.entity.CodigosPostalesEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CodigosPostalesService {
    CodigosPostalesEntity findById(String id);
    Page<CodigosPostalesEntity> findAll(Pageable pageable);
}

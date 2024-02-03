package com.sqlite.catalogos.service;

import com.sqlite.catalogos.persistence.entity.CodigosPostalesEntity;

import java.util.List;

public interface CodigosPostalesService {
    CodigosPostalesEntity findById(String id);
    List<CodigosPostalesEntity> findAll();
}

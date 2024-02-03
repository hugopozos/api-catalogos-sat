package com.sqlite.catalogos.service;

import com.sqlite.catalogos.persistence.entity.RegimenesFiscalesEntity;

import java.util.List;

public interface RegimenesFiscalesService {
    RegimenesFiscalesEntity findById(String id);
    List<RegimenesFiscalesEntity> findAll();
}

package com.sqlite.catalogos.service;

import com.sqlite.catalogos.persistence.entity.RegimenesFiscalesEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface RegimenesFiscalesService {
    RegimenesFiscalesEntity findById(String id);
    Page<RegimenesFiscalesEntity> findAll(Pageable pageable);
}

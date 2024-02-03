package com.sqlite.catalogos.service;

import com.sqlite.catalogos.persistence.entity.MonedasEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface MonedasService {
    Optional<MonedasEntity> findById(String id);
    Page<MonedasEntity> findAll(Pageable pageable);
}

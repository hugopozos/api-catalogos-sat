package com.sqlite.catalogos.service;
import com.sqlite.catalogos.persistence.entity.MetodosPagoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface MetodosPagoService {
    Optional<MetodosPagoEntity> findById(String id);
    Page<MetodosPagoEntity> findAll(Pageable pageable);
}

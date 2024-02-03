package com.sqlite.catalogos.service;
import com.sqlite.catalogos.persistence.entity.FormasPagoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface FormasPagoService {
    Optional<FormasPagoEntity> findById(String id);
    Page<FormasPagoEntity> findAll(Pageable pageable);
}

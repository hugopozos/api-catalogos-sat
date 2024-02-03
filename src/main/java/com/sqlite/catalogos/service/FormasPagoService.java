package com.sqlite.catalogos.service;
import com.sqlite.catalogos.persistence.entity.FormasPagoEntity;
import java.util.List;
import java.util.Optional;

public interface FormasPagoService {
    Optional<FormasPagoEntity> findById(String id);
    List<FormasPagoEntity> findAll();
}

package com.sqlite.catalogos.service;
import com.sqlite.catalogos.persistence.entity.MetodosPagoEntity;
import java.util.List;
import java.util.Optional;

public interface MetodosPagoService {
    Optional<MetodosPagoEntity> findById(String id);
    List<MetodosPagoEntity> findAll();
}

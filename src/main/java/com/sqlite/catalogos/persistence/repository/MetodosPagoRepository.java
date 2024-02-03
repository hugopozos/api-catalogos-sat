package com.sqlite.catalogos.persistence.repository;

import com.sqlite.catalogos.persistence.entity.MetodosPagoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetodosPagoRepository extends JpaRepository<MetodosPagoEntity, String> {
}

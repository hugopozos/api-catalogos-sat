package com.sqlite.catalogos.persistence.repository;

import com.sqlite.catalogos.persistence.entity.FormasPagoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormasPagoRepository extends JpaRepository<FormasPagoEntity, String> {
}

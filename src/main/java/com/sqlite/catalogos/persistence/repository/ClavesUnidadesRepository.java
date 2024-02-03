package com.sqlite.catalogos.persistence.repository;

import com.sqlite.catalogos.persistence.entity.ClavesUnidadesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClavesUnidadesRepository extends JpaRepository<ClavesUnidadesEntity, String> {
}

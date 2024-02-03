package com.sqlite.catalogos.persistence.repository;

import com.sqlite.catalogos.persistence.entity.TiposRelacionesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiposRelacionesRepository extends JpaRepository<TiposRelacionesEntity, String> {
}

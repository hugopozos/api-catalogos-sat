package com.sqlite.catalogos.persistence.repository;

import com.sqlite.catalogos.persistence.entity.CodigosPostalesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodigosPostalesRepository extends JpaRepository<CodigosPostalesEntity, String> {
}

package com.sqlite.catalogos.persistence.repository;

import com.sqlite.catalogos.persistence.entity.RegimenesFiscalesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegimenesFiscalesRepository extends JpaRepository<RegimenesFiscalesEntity, String> {
}

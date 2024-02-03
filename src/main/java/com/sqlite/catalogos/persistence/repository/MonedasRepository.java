package com.sqlite.catalogos.persistence.repository;

import com.sqlite.catalogos.persistence.entity.MonedasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonedasRepository extends JpaRepository<MonedasEntity, String> {
}

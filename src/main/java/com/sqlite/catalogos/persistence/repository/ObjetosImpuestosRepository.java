package com.sqlite.catalogos.persistence.repository;

import com.sqlite.catalogos.persistence.entity.ObjetosImpuestosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjetosImpuestosRepository extends JpaRepository<ObjetosImpuestosEntity, String> {
}

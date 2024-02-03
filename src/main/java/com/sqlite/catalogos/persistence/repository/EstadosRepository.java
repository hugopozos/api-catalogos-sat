package com.sqlite.catalogos.persistence.repository;

import com.sqlite.catalogos.persistence.entity.EstadosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadosRepository extends JpaRepository<EstadosEntity,String> {
}

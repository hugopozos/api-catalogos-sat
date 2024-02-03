package com.sqlite.catalogos.persistence.repository;

import com.sqlite.catalogos.persistence.entity.ProductosServiciosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosServiciosRepository extends JpaRepository<ProductosServiciosEntity, String> {
}

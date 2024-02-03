package com.sqlite.catalogos.persistence.repository;

import com.sqlite.catalogos.persistence.entity.MunicipiosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MunicipiosRepository extends JpaRepository<MunicipiosEntity, MunicipiosEntity.MunicipiosId> {
}

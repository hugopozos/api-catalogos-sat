package com.sqlite.catalogos.persistence.repository;

import com.sqlite.catalogos.persistence.entity.ColoniasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColoniasRepository extends JpaRepository<ColoniasEntity, String> {
}

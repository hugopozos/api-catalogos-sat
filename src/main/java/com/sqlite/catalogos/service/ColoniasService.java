package com.sqlite.catalogos.service;

import com.sqlite.catalogos.persistence.entity.ColoniasEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ColoniasService {
    ColoniasEntity findById(String id);
    Page<ColoniasEntity> findAll(Pageable pageable);
}

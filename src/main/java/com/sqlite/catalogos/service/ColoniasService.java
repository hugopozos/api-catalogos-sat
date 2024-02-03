package com.sqlite.catalogos.service;

import com.sqlite.catalogos.persistence.entity.ColoniasEntity;

import java.util.List;

public interface ColoniasService {
    ColoniasEntity findById(String id);
    List<ColoniasEntity> findAll();
}

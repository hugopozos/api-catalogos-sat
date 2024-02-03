package com.sqlite.catalogos.service;
import com.sqlite.catalogos.persistence.entity.MunicipiosEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MunicipiosService {
    MunicipiosEntity findById(MunicipiosEntity municipiosId);
    Page<MunicipiosEntity> findAll(Pageable pageable);
}

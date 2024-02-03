package com.sqlite.catalogos.service;
import com.sqlite.catalogos.persistence.entity.MunicipiosEntity;
import java.util.List;

public interface MunicipiosService {
    MunicipiosEntity findById(MunicipiosEntity municipiosId);
    List<MunicipiosEntity> findAll();
}

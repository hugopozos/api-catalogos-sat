package com.sqlite.catalogos.service.impl;

import com.sqlite.catalogos.service.MunicipiosService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.sqlite.catalogos.persistence.entity.MunicipiosEntity;
import com.sqlite.catalogos.persistence.repository.MunicipiosRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MunicipiosServiceImpl implements MunicipiosService {

    private final MunicipiosRepository municipiosRepository;

    public MunicipiosEntity findById(MunicipiosEntity municipiosId) {
        return municipiosRepository.findById(municipiosId.getId()).orElse(null);
    }

    public Page<MunicipiosEntity> findAll(Pageable pageable) {
        return municipiosRepository.findAll(pageable);
    }

}

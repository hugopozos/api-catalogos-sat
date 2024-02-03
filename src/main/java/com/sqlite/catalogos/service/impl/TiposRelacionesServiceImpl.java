package com.sqlite.catalogos.service.impl;

import com.sqlite.catalogos.persistence.entity.TiposRelacionesEntity;
import com.sqlite.catalogos.persistence.repository.TiposRelacionesRepository;
import com.sqlite.catalogos.service.TiposRelacionesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TiposRelacionesServiceImpl implements TiposRelacionesService {

    private final TiposRelacionesRepository tiposRelacionesRepository;

    public TiposRelacionesEntity findById(String id) {
        Optional<TiposRelacionesEntity> optional = tiposRelacionesRepository.findById(id);
        return optional.orElse(null);
    }

    public List<TiposRelacionesEntity> findAll() {
        return tiposRelacionesRepository.findAll();
    }
}

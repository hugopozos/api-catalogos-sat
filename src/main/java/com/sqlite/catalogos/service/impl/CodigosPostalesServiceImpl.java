package com.sqlite.catalogos.service.impl;

import com.sqlite.catalogos.persistence.entity.CodigosPostalesEntity;
import com.sqlite.catalogos.persistence.repository.CodigosPostalesRepository;
import com.sqlite.catalogos.service.CodigosPostalesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CodigosPostalesServiceImpl implements CodigosPostalesService {

    private final CodigosPostalesRepository codigosPostalesRepository;

    public CodigosPostalesEntity findById(String id) {
        Optional<CodigosPostalesEntity> optional = codigosPostalesRepository.findById(id);
        return optional.orElse(null);
    }

    public List<CodigosPostalesEntity> findAll() {
        return codigosPostalesRepository.findAll();
    }
}

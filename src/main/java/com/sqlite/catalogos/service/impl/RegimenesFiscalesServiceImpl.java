package com.sqlite.catalogos.service.impl;

import com.sqlite.catalogos.persistence.entity.RegimenesFiscalesEntity;
import com.sqlite.catalogos.persistence.repository.RegimenesFiscalesRepository;
import com.sqlite.catalogos.service.RegimenesFiscalesService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RegimenesFiscalesServiceImpl implements RegimenesFiscalesService {

    private final RegimenesFiscalesRepository regimenesFiscalesRepository;

    public RegimenesFiscalesEntity findById(String id) {
        return regimenesFiscalesRepository.findById(id).orElse(null);
    }

    public Page<RegimenesFiscalesEntity> findAll(Pageable pageable) {
        return regimenesFiscalesRepository.findAll(pageable);
    }

}

package com.sqlite.catalogos.service.impl;

import com.sqlite.catalogos.persistence.entity.UsosCfdiEntity;
import com.sqlite.catalogos.persistence.repository.UsosCfdiRepository;
import com.sqlite.catalogos.service.UsosCfdiService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsosCfdiServiceImpl implements UsosCfdiService {

    private final UsosCfdiRepository usosCfdiRepository;

    public Optional<UsosCfdiEntity> findById(String id) {
        return usosCfdiRepository.findById(id);
    }

    public List<UsosCfdiEntity> findAll() {
        return usosCfdiRepository.findAll();
    }

}

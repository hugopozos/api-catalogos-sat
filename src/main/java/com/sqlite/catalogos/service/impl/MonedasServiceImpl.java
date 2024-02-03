package com.sqlite.catalogos.service.impl;

import com.sqlite.catalogos.persistence.entity.MonedasEntity;
import com.sqlite.catalogos.persistence.repository.MonedasRepository;
import com.sqlite.catalogos.service.MonedasService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MonedasServiceImpl implements MonedasService {

    private final MonedasRepository monedasRepository;

    public Optional<MonedasEntity> findById(String id) {
        return monedasRepository.findById(id);
    }

    public List<MonedasEntity> findAll() {
        return monedasRepository.findAll();
    }

}

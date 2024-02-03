package com.sqlite.catalogos.service.impl;

import com.sqlite.catalogos.persistence.repository.ColoniasRepository;
import com.sqlite.catalogos.service.ColoniasService;
import com.sqlite.catalogos.persistence.entity.ColoniasEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ColoniasServiceImpl implements ColoniasService {

    private final ColoniasRepository coloniasRepository;

    public ColoniasEntity findById(String id) {
        Optional<ColoniasEntity> optional = coloniasRepository.findById(id);
        return optional.orElse(null);
    }

    public Page<ColoniasEntity> findAll(Pageable pageable) {
        return coloniasRepository.findAll(pageable);
    }

}

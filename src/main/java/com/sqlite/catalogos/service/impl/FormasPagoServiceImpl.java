package com.sqlite.catalogos.service.impl;

import com.sqlite.catalogos.persistence.repository.FormasPagoRepository;
import com.sqlite.catalogos.service.FormasPagoService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.sqlite.catalogos.persistence.entity.FormasPagoEntity;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FormasPagoServiceImpl implements FormasPagoService {

    private final FormasPagoRepository formasPagoRepository;

    public Optional<FormasPagoEntity> findById(String id) {
        return formasPagoRepository.findById(id);
    }

    public Page<FormasPagoEntity> findAll(Pageable pageable) {
        return formasPagoRepository.findAll(pageable);
    }

}

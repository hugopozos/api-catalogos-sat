package com.sqlite.catalogos.service.impl;

import com.sqlite.catalogos.persistence.repository.FormasPagoRepository;
import com.sqlite.catalogos.service.FormasPagoService;
import lombok.RequiredArgsConstructor;
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

    public List<FormasPagoEntity> findAll() {
        return formasPagoRepository.findAll();
    }

}

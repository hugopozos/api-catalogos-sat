package com.sqlite.catalogos.application.controllers;

import com.sqlite.catalogos.persistence.entity.ClavesUnidadesEntity;
import com.sqlite.catalogos.service.ClavesUnidadesService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Pageable;

import java.util.List;

@RestController
@RequestMapping("/api/claves-unidades")
@RequiredArgsConstructor
public class ClavesUnidadesController {

    private final ClavesUnidadesService clavesUnidadesService;

    @GetMapping("/{id}")
    public ClavesUnidadesEntity findById(@PathVariable String id) {
        return clavesUnidadesService.findById(id);
    }

    @GetMapping("/all")
    public Page<ClavesUnidadesEntity> findAll(Pageable pageable) {
        return clavesUnidadesService.findAll(pageable);
    }
}

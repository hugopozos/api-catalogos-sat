package com.sqlite.catalogos.application.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sqlite.catalogos.persistence.entity.ObjetosImpuestosEntity;
import com.sqlite.catalogos.service.ObjetosImpuestosService;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/objetos-impuestos")
@RequiredArgsConstructor
public class ObjetosImpuestosController {

    private final ObjetosImpuestosService objetosImpuestosService;

    @GetMapping("/{id}")
    public Optional<ObjetosImpuestosEntity> findById(@PathVariable String id) {
        return objetosImpuestosService.findById(id);
    }

    @GetMapping("/all")
    public Page<ObjetosImpuestosEntity> findAll(Pageable pageable) {
        return objetosImpuestosService.findAll(pageable);
    }


}

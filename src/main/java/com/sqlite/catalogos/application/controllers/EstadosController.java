package com.sqlite.catalogos.application.controllers;

import com.sqlite.catalogos.persistence.entity.EstadosEntity;
import com.sqlite.catalogos.service.EstadosService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/estados")
@RequiredArgsConstructor
public class EstadosController {

    private final EstadosService estadosService;

    @GetMapping("/{id}")
    public EstadosEntity findById(@PathVariable String id) {
        return estadosService.findById(id);
    }

    @GetMapping("/all")
    public Page<EstadosEntity> findAll(Pageable pageable) {
        return estadosService.findAll(pageable);
    }

}

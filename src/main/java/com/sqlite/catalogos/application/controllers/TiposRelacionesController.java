package com.sqlite.catalogos.application.controllers;

import com.sqlite.catalogos.persistence.entity.TiposRelacionesEntity;
import com.sqlite.catalogos.service.TiposRelacionesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tipos-relaciones")
@RequiredArgsConstructor
public class TiposRelacionesController {

    private final TiposRelacionesService tiposRelacionesService;

    @GetMapping("/{id}")
    public TiposRelacionesEntity findById(String id) {
        return tiposRelacionesService.findById(id);
    }

    @GetMapping("/all")
    public List<TiposRelacionesEntity> findAll() {
        return tiposRelacionesService.findAll();
    }

}

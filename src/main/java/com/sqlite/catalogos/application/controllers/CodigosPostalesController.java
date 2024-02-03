package com.sqlite.catalogos.application.controllers;

import com.sqlite.catalogos.persistence.entity.CodigosPostalesEntity;
import com.sqlite.catalogos.service.CodigosPostalesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/codigos-postales")
@RequiredArgsConstructor
public class CodigosPostalesController {

    private final CodigosPostalesService codigosPostalesService;

    @GetMapping("/{id}")
    public CodigosPostalesEntity findById(String id) {
        return codigosPostalesService.findById(id);
    }

    @GetMapping("/all")
    public List<CodigosPostalesEntity> findAll() {
        return codigosPostalesService.findAll();
    }
}

package com.sqlite.catalogos.application.controllers;

import com.sqlite.catalogos.persistence.entity.CodigosPostalesEntity;
import com.sqlite.catalogos.service.CodigosPostalesService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/codigos-postales")
@RequiredArgsConstructor
public class CodigosPostalesController {

    private final CodigosPostalesService codigosPostalesService;

    @GetMapping("/{id}")
    public CodigosPostalesEntity findById(@PathVariable String id) {
        return codigosPostalesService.findById(id);
    }

    @GetMapping("/all")
    public Page<CodigosPostalesEntity> findAll(Pageable pageable) {
        return codigosPostalesService.findAll(pageable);
    }
}

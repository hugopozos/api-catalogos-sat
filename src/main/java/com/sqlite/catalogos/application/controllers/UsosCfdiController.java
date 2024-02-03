package com.sqlite.catalogos.application.controllers;

import com.sqlite.catalogos.persistence.entity.UsosCfdiEntity;
import com.sqlite.catalogos.service.UsosCfdiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usos-cfdi")
@RequiredArgsConstructor
public class UsosCfdiController {

    private final UsosCfdiService usosCfdiService;

    @GetMapping("/{id}")
    public Optional<UsosCfdiEntity> findById(@PathVariable String id) {
        return usosCfdiService.findById(id);
    }

    @GetMapping("/all")
    public List<UsosCfdiEntity> findAll() {
        return usosCfdiService.findAll();
    }

}

package com.sqlite.catalogos.application.controllers;

import com.sqlite.catalogos.persistence.entity.RegimenesFiscalesEntity;
import com.sqlite.catalogos.service.RegimenesFiscalesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/regimenes-fiscales")
@RequiredArgsConstructor
public class RegimenesFiscalesController {

    private final RegimenesFiscalesService regimenesFiscalesService;

    @GetMapping("/{id}")
    public RegimenesFiscalesEntity findById(@PathVariable String id) {
        return regimenesFiscalesService.findById(id);
    }

    @GetMapping("/all")
    public List<RegimenesFiscalesEntity> findAll() {
        return regimenesFiscalesService.findAll();
    }

}

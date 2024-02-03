package com.sqlite.catalogos.application.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sqlite.catalogos.persistence.entity.MetodosPagoEntity;
import com.sqlite.catalogos.service.MetodosPagoService;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/metodos-pago")
@RequiredArgsConstructor
public class MetodosPagoController {

    private final MetodosPagoService metodosPagoService;

    @GetMapping("/{id}")
    public Optional<MetodosPagoEntity> findById(String id) {
        return metodosPagoService.findById(id);
    }

    @GetMapping("/all")
    public List<MetodosPagoEntity> findAll() {
        return metodosPagoService.findAll();
    }


}

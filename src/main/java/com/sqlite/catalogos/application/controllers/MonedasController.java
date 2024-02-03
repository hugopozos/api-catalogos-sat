package com.sqlite.catalogos.application.controllers;

import com.sqlite.catalogos.persistence.entity.MonedasEntity;
import com.sqlite.catalogos.service.MonedasService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/monedas")
@RequiredArgsConstructor
public class MonedasController {

    private final MonedasService monedasService;

    @GetMapping("/{id}")
    public Optional<MonedasEntity> findById(@PathVariable String id) {
        return monedasService.findById(id);
    }

    @GetMapping("/all")
    public List<MonedasEntity> findAll() {
        return monedasService.findAll();
    }

}

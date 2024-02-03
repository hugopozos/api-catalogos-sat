package com.sqlite.catalogos.application.controllers;

import com.sqlite.catalogos.persistence.entity.MunicipiosEntity;
import com.sqlite.catalogos.service.MunicipiosService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/municipios")
@RequiredArgsConstructor
public class MunicipiosController {

    private final MunicipiosService municipiosService;

    @GetMapping("/{id}")
    public MunicipiosEntity findById(@PathVariable MunicipiosEntity municipiosId) {
        return municipiosService.findById(municipiosId);
    }

    @GetMapping("/all")
    public List<MunicipiosEntity> findAll() {
        return municipiosService.findAll();
    }

}

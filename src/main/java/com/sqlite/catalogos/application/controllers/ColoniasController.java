package com.sqlite.catalogos.application.controllers;

import com.sqlite.catalogos.persistence.entity.ColoniasEntity;
import com.sqlite.catalogos.service.ColoniasService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/colonias")
@RequiredArgsConstructor
public class ColoniasController {

    private final ColoniasService coloniasService;

    @GetMapping("/{id}")
    public ColoniasEntity findById(@PathVariable String id) {
        return coloniasService.findById(id);
    }

    @GetMapping("/all")
    public List<ColoniasEntity> findAll() {
        return coloniasService.findAll();
    }
}

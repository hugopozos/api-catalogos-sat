package com.sqlite.catalogos.application.controllers;

import com.sqlite.catalogos.persistence.entity.FormasPagoEntity;
import com.sqlite.catalogos.service.FormasPagoService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/formas-pago")
@RequiredArgsConstructor
public class FormasPagoController {

        private final FormasPagoService formasPagoService;

        @GetMapping("/{id}")
        public Optional<FormasPagoEntity> findById(@PathVariable String id) {
            return formasPagoService.findById(id);
        }

        @GetMapping("/all")
        public Page<FormasPagoEntity> findAll(Pageable pageable) {
            return formasPagoService.findAll(pageable);
        }

}

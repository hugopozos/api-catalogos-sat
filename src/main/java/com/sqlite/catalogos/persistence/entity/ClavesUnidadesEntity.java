package com.sqlite.catalogos.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EnableJpaAuditing
@Entity
@Table(name = "cfdi_40_claves_unidades")
public class ClavesUnidadesEntity {

    @Id
    private String id;

    @Column(name = "texto")
    private String texto;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "notas")
    private String notas;

    @Column(name = "vigencia_desde")
    private String vigencia_desde;

    @Column(name = "vigencia_hasta")
    private String vigencia_hasta;

    @Column(name = "simbolo")
    private String simbolo;
}

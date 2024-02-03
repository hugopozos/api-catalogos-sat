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
@Table(name = "cfdi_40_usos_cfdi")
public class UsosCfdiEntity {

    @Id
    private String id;

    @Column(name = "texto")
    private String texto;

    @Column(name = "aplica_fisica")
    private int aplicaFisica;

    @Column(name = "aplica_moral")
    private int aplicaMoral;

    @Column(name = "regimenes_fiscales_receptores")
    private String regimenesFiscalesReceptores;
}

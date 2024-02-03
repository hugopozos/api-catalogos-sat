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
@Table(name = "cfdi_40_codigos_postales")
public class CodigosPostalesEntity {

    @Id
    private String id;

    @Column(name = "estado")
    private String estado;

    @Column(name = "municipio")
    private String municipio;

    @Column(name = "localidad")
    private String localidad;

    @Column(name = "estimulo_frontera")
    private String estimulo_frontera;

    @Column(name = "vigencia_desde")
    private String vigencia_desde;

    @Column(name = "vigencia_hasta")
    private String vigencia_hasta;

    @Column(name = "huso_descripcion")
    private String huso_descripcion;

    @Column(name = "huso_verano_mes_inicio")
    private String huso_verano_mes_inicio;

    @Column(name = "huso_verano_dia_inicio")
    private String huso_verano_dia_inicio;

    @Column(name = "huso_verano_hora_inicio")
    private String huso_verano_hora_inicio;

    @Column(name = "huso_verano_diferencia")
    private String huso_verano_diferencia;

    @Column(name = "huso_invierno_mes_inicio")
    private String huso_invierno_mes_inicio;

    @Column(name = "huso_invierno_dia_inicio")
    private String huso_invierno_dia_inicio;

    @Column(name = "huso_invierno_hora_inicio")
    private String huso_invierno_hora_inicio;

    @Column(name = "huso_invierno_diferencia")
    private String huso_invierno_diferencia;


}

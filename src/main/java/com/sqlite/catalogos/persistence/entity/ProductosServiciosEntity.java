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
@Table(name = "cfdi_40_productos_servicios")
public class ProductosServiciosEntity {

    @Id
    private String id;

    @Column(name = "texto")
    private String texto;

    @Column(name = "iva_trasladado")
    private int ivaTrasladado;

    @Column(name = "ieps_trasladado")
    private int iepsTrasladado;

    @Column(name = "complemento")
    private String complemento;

    @Column(name = "estimulo_frontera")
    private int estimuloFrontera;

    @Column(name = "similares")
    private String similares;
}

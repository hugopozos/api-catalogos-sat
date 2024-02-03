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
@Table(name = "cfdi_40_colonias")
public class ColoniasEntity {

    @Id
    @Column(name = "colonia")
    private String colonia;

    @Column(name = "codigo_postal")
    private String codigo_postal;

    @Column(name = "texto")
    private String texto;


}

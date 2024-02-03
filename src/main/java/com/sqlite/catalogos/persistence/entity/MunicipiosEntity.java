package com.sqlite.catalogos.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EnableJpaAuditing
@Entity
@Table(name = "cfdi_40_municipios")
public class MunicipiosEntity implements Serializable {

    @EmbeddedId
    private MunicipiosId id;

    @Column(name = "texto")
    private String texto;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MunicipiosId implements Serializable {
        @Column(name = "municipio")
        private String municipio;

        @Column(name = "estado")
        private String estado;
    }
}

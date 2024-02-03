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
@Table(name = "cfdi_40_formas_pago")
public class FormasPagoEntity {

    @Id
    private String id;

    @Column(name = "texto")
    private String texto;

    @Column(name = "es_bancarizado")
    private String es_bancarizado;

    @Column(name = "requiere_numero_operacion")
    private String requiere_numero_operacion;

    @Column(name = "permite_banco_ordenante_rfc")
    private String permite_banco_ordenante_rfc;

    @Column(name = "permite_cuenta_ordenante")
    private String permite_cuenta_ordenante;

    @Column(name = "patron_cuenta_ordenante")
    private String patron_cuenta_ordenante;

    @Column(name = "requiere_banco_beneficiario_rfc")
    private String permite_banco_beneficiario_rfc;

    @Column(name = "permite_cuenta_beneficiario")
    private String permite_cuenta_beneficiario;

    @Column(name = "permite_tipo_cadena_pago")
    private String permite_tipo_cadena_pago;

    @Column(name = "requiere_banco_ordenante_nombre_ext")
    private String requiere_banco_ordenante_nombre_ext;

    @Column(name = "vigencia_desde")
    private String vigencia_desde;

    @Column(name = "vigencia_hasta")
    private String vigencia_hasta;
}

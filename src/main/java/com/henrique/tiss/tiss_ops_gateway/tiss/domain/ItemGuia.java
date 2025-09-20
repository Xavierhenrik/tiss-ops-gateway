package com.henrique.tiss.tiss_ops_gateway.tiss.domain;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "item_guia")
public class ItemGuia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "guia_id")
    private Guia guia;

    @Column(name = "codigo_procedimento")
    private String codigoProcedimento;

    private String descricao;
    private Integer quantidade;

    @Column(name = "valor_unit")
    private BigDecimal valorUnit;

    @Column(name = "valor_total")
    private BigDecimal valorTotal;

    // Getters e Setters
    // ...
}

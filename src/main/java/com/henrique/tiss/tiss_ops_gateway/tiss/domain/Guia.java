package com.henrique.tiss.tiss_ops_gateway.tiss.domain;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "guia")
public class Guia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;
    private String numero;

    @ManyToOne
    @JoinColumn(name = "lote_id")
    private LoteTiss lote;

    @ManyToOne
    @JoinColumn(name = "beneficiario_id")
    private Beneficiario beneficiario;

    @ManyToOne
    @JoinColumn(name = "prestador_id")
    private Prestador prestador;

    @Column(name = "data_atendimento")
    private LocalDate dataAtendimento;

    @Column(name = "valor_total")
    private BigDecimal valorTotal;

    private String status;

    @OneToMany(mappedBy = "guia", cascade = CascadeType.ALL)
    private List<ItemGuia> itens;

    // Getters e Setters
    // ...
}

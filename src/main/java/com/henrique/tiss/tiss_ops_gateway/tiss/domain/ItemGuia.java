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
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Guia getGuia() {
        return guia;
    }

    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    public String getCodigoProcedimento() {
        return codigoProcedimento;
    }

    public void setCodigoProcedimento(String codigoProcedimento) {
        this.codigoProcedimento = codigoProcedimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(BigDecimal valorUnit) {
        this.valorUnit = valorUnit;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
}

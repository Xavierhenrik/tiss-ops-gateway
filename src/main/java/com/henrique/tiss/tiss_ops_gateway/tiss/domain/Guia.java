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
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LoteTiss getLote() {
        return lote;
    }

    public void setLote(LoteTiss lote) {
        this.lote = lote;
    }

    public Beneficiario getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Beneficiario beneficiario) {
        this.beneficiario = beneficiario;
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }

    public LocalDate getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(LocalDate dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ItemGuia> getItens() {
        return itens;
    }

    public void setItens(List<ItemGuia> itens) {
        this.itens = itens;
    }
}

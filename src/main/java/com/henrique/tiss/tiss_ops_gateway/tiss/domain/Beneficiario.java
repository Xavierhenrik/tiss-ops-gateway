package com.henrique.tiss.tiss_ops_gateway.tiss.domain;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "beneficiario")
public class Beneficiario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;
    private String nome;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @OneToMany(mappedBy = "beneficiario")
    private List<Guia> guias;

    // Getters e Setters
    // ...
}

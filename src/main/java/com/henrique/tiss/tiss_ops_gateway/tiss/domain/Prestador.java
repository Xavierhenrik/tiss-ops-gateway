package com.henrique.tiss.tiss_ops_gateway.tiss.domain;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "prestador")
public class Prestador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cnpj;
    private String nome;

    @OneToMany(mappedBy = "prestador")
    private List<Guia> guias;

    // Getters e Setters
    // ...
}


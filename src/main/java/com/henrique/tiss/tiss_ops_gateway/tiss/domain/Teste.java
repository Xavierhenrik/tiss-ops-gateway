package com.henrique.tiss.tiss_ops_gateway.tiss.domain;

import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {
        Beneficiario beneficiario = new Beneficiario();
        beneficiario.setId(1L);
        beneficiario.setCodigo("BENE-0001");
        beneficiario.setNome("Fulano da Silva");
        beneficiario.setDataNascimento(LocalDate.of(1990, 5, 12));

        System.out.println("ID: " + beneficiario.getId());
        System.out.println("Código: " + beneficiario.getCodigo());
        System.out.println("Nome: " + beneficiario.getNome());
        System.out.println("Nascimento: " + beneficiario.getDataNascimento());

        Guia guia = new Guia();
        guia.setId(12345L);
        guia.setBeneficiario(beneficiario);

        System.out.println("Guia ID: " + guia.getId());
        System.out.println("Guia -> Beneficiário Nome: " + guia.getBeneficiario().getNome());
    }
}

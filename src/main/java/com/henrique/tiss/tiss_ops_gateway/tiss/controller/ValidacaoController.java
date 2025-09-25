package com.henrique.tiss.tiss_ops_gateway.tiss.controller;

import com.henrique.tiss.tiss_ops_gateway.tiss.domain.Guia;
import com.henrique.tiss.tiss_ops_gateway.tiss.dto.ValidacaoConsultaDTO;
import com.henrique.tiss.tiss_ops_gateway.tiss.service.ValidacaoGuiaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/validacao")
public class ValidacaoController {

    private final ValidacaoGuiaService validacaoGuiaService;

    public ValidacaoController(ValidacaoGuiaService validacaoGuiaService) {
        this.validacaoGuiaService = validacaoGuiaService;
    }

    @PostMapping("/consulta")
    public ResponseEntity<Guia> validarConsulta(@RequestBody ValidacaoConsultaDTO dto) {
        Guia guia = validacaoGuiaService.validarConsulta(dto);
        return ResponseEntity.ok(guia);
    }
}



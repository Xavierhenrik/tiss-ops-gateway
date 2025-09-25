package com.henrique.tiss.tiss_ops_gateway.tiss.dto;

import java.time.LocalDate;

public record ValidacaoConsultaDTO(
        Long guiaId,
        String codigoProcedimento,
        LocalDate dataAtendimento,
        String justificativa
) {}



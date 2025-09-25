package com.henrique.tiss.tiss_ops_gateway.tiss.service;

import com.henrique.tiss.tiss_ops_gateway.tiss.domain.Guia;
import com.henrique.tiss.tiss_ops_gateway.tiss.domain.ItemGuia;
import com.henrique.tiss.tiss_ops_gateway.tiss.domain.StatusGuia;
import com.henrique.tiss.tiss_ops_gateway.tiss.dto.ValidacaoConsultaDTO;
import com.henrique.tiss.tiss_ops_gateway.tiss.repo.GuiaRepository;
import jakarta.transaction.Transactional;
import java.math.BigDecimal;
import java.util.Objects;
import org.springframework.stereotype.Service;

@Service
public class ValidacaoGuiaService {

    private final GuiaRepository guiaRepository;

    public ValidacaoGuiaService(GuiaRepository guiaRepository) {
        this.guiaRepository = guiaRepository;
    }

    @Transactional
    public Guia validarConsulta(ValidacaoConsultaDTO dto) {
        Guia guia = guiaRepository.findById(dto.guiaId())
                .orElseThrow(() -> new IllegalArgumentException("Guia não encontrada"));

        // Regra inicial simplificada: aceita consultas com código 'CONSULTA' e valor <= 300
        boolean possuiItemConsulta = guia.getItens().stream()
                .filter(ig -> Objects.equals(ig.getCodigoProcedimento(), dto.codigoProcedimento()))
                .findFirst()
                .isPresent();

        if (!possuiItemConsulta) {
            guia.setStatus(StatusGuia.RECUSADA.name());
            return guiaRepository.save(guia);
        }

        BigDecimal valorMaximo = new BigDecimal("300.00");
        BigDecimal soma = guia.getItens().stream()
                .map(ItemGuia::getValorTotal)
                .filter(Objects::nonNull)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        if (soma.compareTo(valorMaximo) > 0) {
            guia.setStatus(StatusGuia.GLOSADA.name());
        } else {
            guia.setStatus(StatusGuia.ACEITA.name());
        }

        return guiaRepository.save(guia);
    }
}



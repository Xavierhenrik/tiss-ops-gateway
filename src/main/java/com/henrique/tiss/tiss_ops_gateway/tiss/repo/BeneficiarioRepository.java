package com.henrique.tiss.tiss_ops_gateway.tiss.repo;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.henrique.tiss.tiss_ops_gateway.tiss.domain.Beneficiario;

@Repository
public interface BeneficiarioRepository extends JpaRepository<Beneficiario, Long> {
	// Busca exata pelo código (único)
	Optional<Beneficiario> findByCodigo(String codigo);

	// Verificação de existência por código
	boolean existsByCodigo(String codigo);

	// Busca por nome contendo (case-insensitive)
	List<Beneficiario> findByNomeContainingIgnoreCase(String nome);
	Page<Beneficiario> findByNomeContainingIgnoreCase(String nome, Pageable pageable);

	// Intervalo por data de nascimento
	List<Beneficiario> findAllByDataNascimentoBetween(LocalDate inicio, LocalDate fim);

	// Encontrar beneficiário a partir do id de uma guia associada
	@Query("select b from Beneficiario b join b.guias g where g.id = :guiaId")
	Optional<Beneficiario> findByGuiaId(@Param("guiaId") Long guiaId);

	// Exemplo de métrica simples
	long countByDataNascimentoBefore(LocalDate data);
}

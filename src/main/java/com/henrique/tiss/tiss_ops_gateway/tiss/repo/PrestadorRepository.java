package com.henrique.tiss.tiss_ops_gateway.tiss.repo;

import com.henrique.tiss.tiss_ops_gateway.tiss.domain.Prestador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestadorRepository extends JpaRepository<Prestador, Long> {
    // Aqui você pode adicionar consultas personalizadas se precisar
}

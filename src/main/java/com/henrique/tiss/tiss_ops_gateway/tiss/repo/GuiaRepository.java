package com.henrique.tiss.tiss_ops_gateway.tiss.repo;

import com.henrique.tiss.tiss_ops_gateway.tiss.domain.Guia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuiaRepository extends JpaRepository<Guia, Long> {
    // Aqui você pode adicionar consultas personalizadas se precisar
}

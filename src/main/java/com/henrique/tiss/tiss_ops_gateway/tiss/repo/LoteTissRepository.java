package com.henrique.tiss.tiss_ops_gateway.tiss.repo;

import com.henrique.tiss.tiss_ops_gateway.tiss.domain.LoteTiss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoteTissRepository extends JpaRepository<LoteTiss, Long> {
    // Aqui você pode adicionar consultas personalizadas se precisar
}


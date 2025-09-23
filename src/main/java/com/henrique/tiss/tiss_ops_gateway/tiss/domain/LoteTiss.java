package com.henrique.tiss.tiss_ops_gateway.tiss.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "lote_tiss")
public class LoteTiss {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String filename;
    private String version;

    @Column(name = "received_at")
    private LocalDateTime receivedAt = LocalDateTime.now();

    private String status;

    // Relacionamento: 1 Lote -> várias guias
    @OneToMany(mappedBy = "lote", cascade = CascadeType.ALL)
    private List<Guia> guias;
    
}

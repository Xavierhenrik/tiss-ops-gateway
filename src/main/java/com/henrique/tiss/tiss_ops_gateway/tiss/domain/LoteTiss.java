package com.henrique.tiss.tiss_ops_gateway.tiss.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

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

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFilename() { return filename; }
    public void setFilename(String filename) { this.filename = filename; }

    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }

    public LocalDateTime getReceivedAt() { return receivedAt; }
    public void setReceivedAt(LocalDateTime receivedAt) { this.receivedAt = receivedAt; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public List<Guia> getGuias() { return guias; }
    public void setGuias(List<Guia> guias) { this.guias = guias; }
}

package com.henrique.tiss.tiss_ops_gateway.config;

import com.henrique.tiss.tiss_ops_gateway.tiss.domain.Beneficiario;
import com.henrique.tiss.tiss_ops_gateway.tiss.repo.BeneficiarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DevSmoke {
  @Bean
  CommandLineRunner smoke(BeneficiarioRepository repo) {
    return args -> {
      if (repo.count() == 0) {
        Beneficiario b = new Beneficiario();
        b.setNome("Teste Henrique");
        b.setCodigo("B001");
        repo.save(b);
      }
      System.out.println("Beneficiarios no banco: " + repo.count());
    };
  }
}

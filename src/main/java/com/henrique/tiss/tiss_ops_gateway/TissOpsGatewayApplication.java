package com.henrique.tiss.tiss_ops_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {
	SecurityAutoConfiguration.class, 
	FlywayAutoConfiguration.class
})
public class TissOpsGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TissOpsGatewayApplication.class, args);
	}

}

package com.masatrio.ms.masatrioms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.masatrio.ms.masatrioms.persistence.repo") 
@EntityScan("com.masatrio.ms.masatrioms.persistence.model")
@SpringBootApplication
public class MasatrioMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasatrioMsApplication.class, args);
	}
}

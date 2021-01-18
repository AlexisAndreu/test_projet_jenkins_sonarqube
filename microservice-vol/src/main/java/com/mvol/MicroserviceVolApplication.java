package com.mvol;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.mvol.entities.Vol;
import com.mvol.repositories.VolRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceVolApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceVolApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(VolRepository volRepository) {
		return (args) -> {
			Stream.of(new Vol("Madrid", "Vol pour Madrid"),
				      new Vol("Paris", "Vol pour Paris"),
				      new Vol("New York", "Vol pour New York"),
				      new Vol("São Paulo", "Vol pour São Paulo"),
				      new Vol("Londres", "Vol pour Londres"))
			.forEach((v) -> {
				volRepository.save(v);
			});
		};
	}

}

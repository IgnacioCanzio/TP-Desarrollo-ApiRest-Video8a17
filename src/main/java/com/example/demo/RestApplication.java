package com.example.demo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entities.Domicilio;
import com.example.demo.entities.Persona;
import com.example.demo.repositories.PersonaRepository;

import jakarta.transaction.Transactional;

@SpringBootApplication
public class RestApplication {

	private static final Logger logger = LoggerFactory.getLogger(RestApplication.class);

	@Autowired
	private PersonaRepository personaRepository;

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);

		System.out.println("Andando! ejej");
	}

	//fuera del main crea los objetos

	@Bean
	@Transactional
	CommandLineRunner init(PersonaRepository personaRepository){ return args -> {

		Persona person1 = Persona.builder()
		.apellido("Hernandez")
		.nombre("Juan")
		.build();

		Domicilio domi1 = Domicilio.builder()
		.calle("Perito Moreno").numero(299)
		.build();

		person1.setDomicilio(domi1);

		personaRepository.save(person1); //con esto se graba a traves de Spring

		//Creo otra persona

		Persona person2 = Persona.builder()
		.apellido("Gimenez")
		.nombre("Esteban")
		.build();

		Domicilio domi2 = Domicilio.builder()
		.calle("San Juan")
		.numero(100)
		.build();

		person2.setDomicilio(domi2);

		personaRepository.save(person2);

		List<Persona> recuperadas = personaRepository.findAll();
		System.out.println(recuperadas);

		logger.info("Detalles de la persona: {}",recuperadas);

		domi1.setCalle("Alberdi");
		personaRepository.save(person1);

	};
	}

}

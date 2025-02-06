package com.Kings.AulaSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*
@SpringBootApplication é a fusao de:
@Configuration - metodos que definem beans
@EnableAutoConfiguration - ativa autoconfig
@ComponentScan - permite o escaneamento do código
 */

public class   AulaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AulaSpringApplication.class, args);
	}

}

package br.com.curso.de.programacao.projetospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoSpringApplication {

	public static void main(String[] args) {

		System.out.println("Ola Mundo!!");
		SpringApplication.run(ProjetoSpringApplication.class, args);
	}

}

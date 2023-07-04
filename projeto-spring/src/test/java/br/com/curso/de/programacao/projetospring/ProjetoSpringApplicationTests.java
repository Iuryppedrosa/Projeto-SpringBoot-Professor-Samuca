package br.com.curso.de.programacao.projetospring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class ProjetoSpringApplicationTests {

	private BigDecimal meuSalarioDeProgramador = new BigDecimal("20.00");
	@Test
	void contextLoads()
	{
		System.out.println("Comecando o debug");
		System.out.println("O salario do programador é " + meuSalarioDeProgramador);
		System.out.println("Fim do debug");
	}

}

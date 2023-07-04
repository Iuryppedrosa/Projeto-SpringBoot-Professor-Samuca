package br.com.curso.de.programacao.projetospring.controller;

import br.com.curso.de.programacao.projetospring.entities.Salarios;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;

@Controller
public class GeradorDeSalarios
{
    public BigDecimal salarioProgramador(){
        Salarios salarioProgramador = new Salarios();
        salarioProgramador.setMeuSalarioDeProgramador(new BigDecimal(30000));

        return salarioProgramador.getMeuSalarioDeProgramador();
    }
}

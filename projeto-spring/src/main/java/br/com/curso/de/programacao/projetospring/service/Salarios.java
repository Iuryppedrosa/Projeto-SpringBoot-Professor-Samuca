package br.com.curso.de.programacao.projetospring.service;

import br.com.curso.de.programacao.projetospring.controller.GeradorDeSalarios;
import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Salarios {


    @Autowired
    private GeradorDeSalarios geradorDeSalarios;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, path = "salario-programador",
            produces = MediaType.APPLICATION_JSON)

    public ResponseEntity<?> getSalario()
    {
        return new ResponseEntity<>(geradorDeSalarios.salarioProgramador(), HttpStatus.OK);
    }
}

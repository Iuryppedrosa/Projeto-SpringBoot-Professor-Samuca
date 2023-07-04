package br.com.curso.de.programacao.projetospring.entities;

import java.math.BigDecimal;

public class Salarios {

    private BigDecimal meuSalarioDeProgramador = BigDecimal.ZERO;
    private BigDecimal meuSalarioDeStreaming = BigDecimal.ZERO;

    public Salarios()
    {

    }

    public Salarios(BigDecimal meuSalarioDeProgramador){

    }

    public Salarios(BigDecimal meuSalarioDeProgramador, BigDecimal meuSalarioDeStreaming) {
        this.meuSalarioDeProgramador = meuSalarioDeProgramador;
        this.meuSalarioDeStreaming = meuSalarioDeStreaming;
    }

    public BigDecimal getMeuSalarioDeProgramador() {
        return meuSalarioDeProgramador;
    }

    public void setMeuSalarioDeProgramador(BigDecimal meuSalarioDeProgramador) {
        this.meuSalarioDeProgramador = meuSalarioDeProgramador;
    }

    public BigDecimal getMeuSalarioDeStreaming() {
        return meuSalarioDeStreaming;
    }

    public void setMeuSalarioDeStreaming(BigDecimal meuSalarioDeStreaming) {
        this.meuSalarioDeStreaming = meuSalarioDeStreaming;
    }

    @Override
    public String toString() {
        return "Salarios{" +
                "meuSalarioDeProgramador=" + meuSalarioDeProgramador +
                ", meuSalarioDeStreaming=" + meuSalarioDeStreaming +
                '}';
    }
}

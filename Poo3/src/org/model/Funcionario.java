package org.model;

public class Funcionario {
    private String nome;
    private String matricula;

    public Funcionario() {
        this.nome = "";
        this.matricula = "";
    }
    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
}

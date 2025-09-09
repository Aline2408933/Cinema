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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}

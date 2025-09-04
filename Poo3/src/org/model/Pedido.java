package org.model;

public class Pedido {
    private int numero;
    private Sessao sessão;
    private Funcionario funcionario;

    public Pedido() {
        this.numero = 0;
        this.sessão = sessão;
        this.funcionario = funcionario;
    }


    public Pedido(int numero, Sessao sessão, Funcionario funcionario) {
        this.numero = numero;
        this.sessão = sessão;
        this.funcionario = funcionario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Sessao getSessão() {
        return sessão;
    }

    public void setSessão(Sessao sessão) {
        this.sessão = sessão;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

}

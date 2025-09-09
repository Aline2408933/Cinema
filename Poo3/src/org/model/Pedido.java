package org.model;

public class Pedido {
    private int numero;
    private Sessao sessao;
    private Funcionario funcionario;
    private Cliente cliente;

    public Pedido() {
        this.numero = 0;
        this.sessao = null;
        this.funcionario = null;
        this.cliente = null;
    }


    public Pedido(int numero, Sessao sessao, Funcionario funcionario) {
        this.numero = numero;
        this.sessao = sessao;
        this.funcionario = funcionario;
        this.cliente = cliente;
    }

    public Pedido(int i, Sessao sessao, Funcionario funcionario, Cliente cliente) {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

package org.model;

public class Ingresso {
    private String Inteiro;
    private String Meia;

    private int quantidademeia;
    private int quantidadeinteiro;

     private Cliente cliente;


    public Ingresso() {
        Inteiro = "";
        Meia = "";
        this.quantidademeia = 0;
        this.quantidadeinteiro = 0;
    }

    public Ingresso(String inteiro, String meia, int quantidademeia, int quantidadeinteiro, Cliente cliente) {
        Inteiro = inteiro;
        Meia = meia;
        this.quantidademeia = quantidademeia;
        this.quantidadeinteiro = quantidadeinteiro;
    }

    public String getInteiro() {
        return Inteiro;
    }

    public void setInteiro(String inteiro) {
        Inteiro = inteiro;
    }

    public String getMeia() {
        return Meia;
    }

    public void setMeia(String meia) {
        Meia = meia;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getQuantidademeia() {
        return quantidademeia;
    }

    public void setQuantidademeia(int quantidademeia) {
        this.quantidademeia = quantidademeia;
    }

    public int getQuantidadeinteiro() {
        return quantidadeinteiro;
    }

    public void setQuantidadeinteiro(int quantidadeinteiro) {
        this.quantidadeinteiro = quantidadeinteiro;
    }

    public Cliente getCliente() {
        return cliente;
    }
}

package org.model;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String nome;
    private List<Sala> salas;
    private List<Filme> filmes;

    public Cinema() {
        this.nome = "";
        this.salas = new ArrayList<>();
        this.filmes = new ArrayList<>();
    }

    public Cinema(String nome) {
        this.nome = nome;
        this.salas = new ArrayList<>();
        this.filmes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void adicionarSala(Sala salas) {
        this.salas.add(salas);
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void adicionarFilmes(Filme filmes) {
        this.filmes.add(filmes);
    }
}

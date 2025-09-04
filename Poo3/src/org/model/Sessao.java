package org.model;

import java.util.Date;

public class Sessao {

    private Date horario;
    private Filme filme;
    private Sala sala;

    public Sessao(Date horario, Filme filme, Sala sala) {
        this.horario = horario;
        this.filme = filme;
        this.sala = sala;
    }

    public Sessao() {
        this.horario = new Date();
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
}
\\\\\\\\\\\\\ professor me ajudou
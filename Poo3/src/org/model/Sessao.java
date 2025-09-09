package org.model;
import java.util.Date;
public class Sessao {
    private Date horario;
    private Filme filme;
    private Sala sala;
    private int ingressosDisponiveis;
    public Sessao(){
        this.horario = new Date();
        this.filme = null;
        this.sala = null;
        this.ingressosDisponiveis = 0;
    }
    public Sessao(Date horario, Filme filme, Sala sala) {
        this.horario = horario;
        this.filme = filme;
        this.sala = sala;
        this.ingressosDisponiveis = sala.getCapacidade();
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
    public int getIngressosDisponiveis() {
        return ingressosDisponiveis;
    }


  public boolean venderIngresso(){
        if (ingressosDisponiveis > 0){
            ingressosDisponiveis--;
            return true;
        }
        return false;
  }
}

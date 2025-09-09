package org.principal;

import org.model.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Cinema cinema = new Cinema("Cine Aline");

        Sala sala1 = new Sala(1, 15);
        cinema.adicionarSala(sala1);

        Filme filme1 = new Filme("O Senhor dos Anéis", 180);
        cinema.adicionarFilmes(filme1);

        Sessao sessao1 = new Sessao(new Date(), filme1, sala1);


        Funcionario funcionario = new Funcionario("João", "FUNC001");


        Cliente cliente1 = new Cliente("Maria", "12345678900", 25);
        Cliente cliente2 = new Cliente("Pedro", "98765432100", 30);
        Cliente cliente3 = new Cliente("Ana", "11122233344", 20);
        Cliente cliente4 = new Cliente("Lucas", "55566677788", 28);

        venderIngresso(sessao1, cliente1, funcionario, "meia");
        venderIngresso(sessao1, cliente2, funcionario, "inteiro");
        venderIngresso(sessao1, cliente3, funcionario, "inteiro");
        venderIngresso(sessao1, cliente4, funcionario, "meia"); // aqui deve lotar

        System.out.println("\nIngressos disponíveis no final: " + sessao1.getIngressosDisponiveis());
    }

    public static void venderIngresso(Sessao sessao, Cliente cliente, Funcionario funcionario, String tipo) {
        if (sessao.venderIngresso()) {
            Ingresso ingresso = new Ingresso(tipo, cliente, sessao);
            Pedido pedido = new Pedido(1, sessao, funcionario, cliente);

            System.out.println("✅ Ingresso vendido para " + cliente.getNome() +
                    " (" + tipo + ") - Filme: " + sessao.getFilme().getTitulo());
        } else {
            System.out.println("❌ Não foi possível vender ingresso para " + cliente.getNome() +
                    " - Sessão lotada!");
        }
    }
}
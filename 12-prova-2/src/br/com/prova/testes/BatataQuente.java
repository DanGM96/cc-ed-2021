package br.com.prova.testes;

import java.util.Random;

import br.com.prova.estruturadedados.Fila;

public class BatataQuente {

    public static void brincadeira(Fila<String> circulo) {
        Random rand = new Random();
        String comBatata = circulo.desenfileira();
        String alvo = circulo.desenfileira();

        System.out.println("Agora é a vez de " + comBatata);
        System.out.print("🥔 Batata quente");

        while(rand.nextInt(100) < 76){ // 75% de chance de ser "quente"
            System.out.print(", quente");
            circulo.enfileirar(alvo);
            alvo = circulo.desenfileira();
        }

        System.out.println("... queimou!");
        System.out.println(alvo + " se queimou");
        circulo.enfileirar(comBatata);
    }

    public static void main(String[] args) {

        Fila<String> circulo = new Fila<String>();
        String[] criancas = new String[]{
            "Miguel",
            "Arthur",
            "Davi",
            "Gabriel",
            "Maria",
            "Alice",
            "Heitor",
            "Pedro",
            "Laura",
            "Sophia",
        };
        for (String c : criancas) {
            circulo.enfileirar(c);
        }
        System.out.println("Circulo de crianças: " + circulo);

        while (circulo.tamanho() > 1) {
            brincadeira(circulo);
        }

        System.out.println("Vencedor(a): " + circulo);
    }
}

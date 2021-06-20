package br.com.trabalho.testes;

import br.com.trabalho.estruturadedados.Pilha;

public class TorreDeHanoi {

    public static void hanoi(int n, Pilha<Integer> torreA, Pilha<Integer> torreB, Pilha<Integer> torreC) {
        if (n > 0) {            
            hanoi(n - 1, torreA, torreC, torreB);
            torreB.empilha(torreA.desempilha());
            hanoi(n - 1, torreC, torreB, torreA);
        }
    }

    public static void main(String[] args) {
        Pilha<Integer> esquerda = new Pilha<Integer>();
        Pilha<Integer> meio = new Pilha<Integer>();
        Pilha<Integer> direita = new Pilha<Integer>();
        
        int quant = 3;
        for (int i = quant; i > 0; i--) {
            esquerda.empilha(i);
        }
        
        System.out.println("Visualização Inicial");
        System.out.println(esquerda);
        System.out.println(meio);
        System.out.println(direita);

        hanoi(quant, esquerda, direita, meio);

        System.out.println("\nVisualização Final");
        System.out.println(esquerda);
        System.out.println(meio);
        System.out.println(direita);
    }
}

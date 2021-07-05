package br.com.trabalho.testes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Teste_06 {

    public static void inverterLista(Queue<Integer> lista) {
        Stack<Integer> pilha = new Stack<>();
        while (!lista.isEmpty()) {
            pilha.push(lista.poll());
        }
        while (!pilha.isEmpty()) {
            lista.add(pilha.pop());
        }
    }

    public static void main(String[] args) {
        int[] nums = {8, 4, 12, 2, 6, 10, 14, 1, 3, 5, 11, 13, 15};

        Queue<Integer> filaInt = new LinkedList<>();
        for (int n : nums) {
            filaInt.add(n);
        }
        System.out.println(filaInt);
        inverterLista(filaInt);
        System.out.println(filaInt);
    }
}

package br.com.trabalho.testes;

import java.util.Stack;

public class Teste_08 {

    public static void imprimirAoContrario(Stack<Integer> pilha) {

        if (pilha.isEmpty()){
            return;
        }

        Stack<Integer> pilhaAux = new Stack<>();

        while(!pilha.isEmpty()){
            pilhaAux.push(pilha.pop());
        }

        while(!pilhaAux.isEmpty()){
            int n = pilhaAux.pop();
            System.out.print(n + " ");
            pilha.push(n);
        }
    }

    public static void fib(Stack<Integer> pilha, int n) {
        if (n <= 2) {
            return;
        }
        int pos = pilha.size() - 1;
        pilha.push(pilha.get(pos) + pilha.get(pos - 1));
        fib(pilha, --n);
    }

    public static void main(String[] args){
        Stack<Integer> pilhaFib = new Stack<>();
        pilhaFib.push(0);
        pilhaFib.push(1);
        int tamanho = 12;

        fib(pilhaFib, tamanho);
        imprimirAoContrario(pilhaFib);
    }
}

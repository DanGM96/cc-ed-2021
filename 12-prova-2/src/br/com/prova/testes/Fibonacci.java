package br.com.prova.testes;

import java.util.Scanner;

import br.com.prova.estruturadedados.Lista;

public class Fibonacci {
    public static int fibonacci(int n){
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    public static void fib(Lista<Integer> lista, int n) throws IllegalAccessException{
        if (n <= 2) {
            return;
        }
        int pos = lista.tamanho() - 1;
        lista.adiciona(lista.busca(pos) + lista.busca(pos - 1));
        fib(lista, --n);
    }

    public static void main(String[] args){
        
        int tamanho = 12;
        // Descomente o código para fazer o input no console 
        /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira quantas casas de Fibonacci você quer ver: ");
        tamanho = scan.nextInt();
        scan.close();
        */

        // Método 1: Ineficiente, faz cálculos repetidos
        for (int i = 0; i < tamanho; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        // Método 2: Reutiliza os resultados, mas já é iniciado com 2 casas
        Lista<Integer> lista = new Lista<Integer>(tamanho);
        lista.adiciona(0);
        lista.adiciona(1);
        try {
            fib(lista, tamanho);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("\n" + lista);
    }
}

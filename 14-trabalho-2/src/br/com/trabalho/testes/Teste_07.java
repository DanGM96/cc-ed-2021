package br.com.trabalho.testes;

import java.util.Stack;

public class Teste_07 {

    public static char converteSimbolo(int num) {
        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        return hexa[num];
    }

    /**
     * Converte um valor decimal para qualquer sistema numérico entre 2 e 16
     * @param valor o valor decimal para ser convertido
     * @param sistema 2 para binário, 8 para octal, 16 para hexadecimal
     */
    public static void converterDecimal(int valor, int sistema){
        Stack<Integer> pilha = new Stack<Integer>();
        System.out.println("Convertendo " + valor + " da base 10 para base " + sistema);

        while (valor != 0) {
            int bin = valor % sistema;
            pilha.push(bin);
            valor /= sistema;
        }

        int tamanho = pilha.size();
        if (tamanho > 0) {
            for (int i = 0; i < tamanho; i++) {
                if(sistema < 11){
                    System.out.print(pilha.pop());
                } else {
                    System.out.print(converteSimbolo(pilha.pop()));
                }
            }
            System.out.println();
        } else {
            System.out.println(0);
        }
    }

    public static void main(String[] args) {
        int valorDecimal = 15;
        int binario = 2;
        int octal = 8;
        int hexadecimal = 16;
        converterDecimal(valorDecimal, binario);
        converterDecimal(valorDecimal, octal);
        converterDecimal(valorDecimal, hexadecimal);
    }
}

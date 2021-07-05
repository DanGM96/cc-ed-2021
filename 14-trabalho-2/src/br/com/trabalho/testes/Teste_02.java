package br.com.trabalho.testes;

import java.util.ArrayList;
import java.util.List;

public class Teste_02 {

    public static int contagemPares(List<Integer> lista) {
        if (lista.isEmpty()) {
            System.out.println("Erro: lista vazia");
            return -1;
        }
        int contagem = 0;
        for (int n : lista) {
            if ((n % 2) == 0) {
                contagem++;
            }
        }
        return contagem;
    }
    
    public static int maiorValor(List<Integer> lista) {
        if (lista.isEmpty()) {
            System.out.println("Erro: lista vazia");
            return -1;
        }
        int maiorValor = lista.get(0);
        for (int n : lista) {
            if (n > maiorValor) {
                maiorValor = n;
            }
        }
        return maiorValor;
    }
    
    public static int menorValor(List<Integer> lista) {
        if (lista.isEmpty()) {
            System.out.println("Erro: lista vazia");
            return -1;
        }
        int menorValor = lista.get(0);
        for (int n : lista) {
            if (n < menorValor) {
                menorValor = n;
            }
        }
        return menorValor;
    }
    
    public static int posiMaiorValor(List<Integer> lista) {
        if (lista.isEmpty()) {
            System.out.println("Erro: lista vazia");
            return -1;
        }
        int maiorValor = maiorValor(lista);
        return lista.indexOf(maiorValor);
    }
    
    public static int posiMenorValor(List<Integer> lista) {
        if (lista.isEmpty()) {
            System.out.println("Erro: lista vazia");
            return -1;
        }
        int menorValor = menorValor(lista);
        return lista.indexOf(menorValor);
    }
    
    public static int contagemMaiorQue(List<Integer> lista, int x) {
        if (lista.isEmpty()) {
            System.out.println("Erro: lista vazia");
            return -1;
        }
        int contagem = 0;
        for (int n : lista) {
            if (n > x) {
                contagem++;
            }
        }
        return contagem;
    }
    
    public static int somaLista(List<Integer> lista) {
        if (lista.isEmpty()) {
            System.out.println("Erro: lista vazia");
            return -1;
        }
        int soma = 0;
        for (int n : lista) {
            soma += n;
        }
        return soma;
    }
    
    public static void main(String[] args) {
        int[] nums = {8, 4, 12, 2, 6, 10, 14, 1, 3, 5, 11, 13, 15};

        List<Integer> listaInt = new ArrayList<>();
        for (int n : nums) {
            listaInt.add(n);
        }

        int x = 8;

        System.out.println("contagemPares = " + contagemPares(listaInt));
        System.out.println("maiorValor = " + maiorValor(listaInt));
        System.out.println("menorValor = " + menorValor(listaInt));
        System.out.println("posiMaiorValor = " + posiMaiorValor(listaInt));
        System.out.println("posiMenorValor = " + posiMenorValor(listaInt));
        System.out.println("contagemMaiorQue(" + x + ") = " + contagemMaiorQue(listaInt, x));
        System.out.println("somaLista = " + somaLista(listaInt));
    }
}

package br.com.trabalho.testes;

import java.util.ArrayList;
import java.util.List;

import br.com.trabalho.classes.Produto;

public class Teste_01 {

    public static Produto buscaMenorPreco(List<Produto> lista) {
        if (lista.isEmpty()) {
            System.out.print("Lista vazia: buscaMenorPreco = ");
            return null;
        }
        Produto maisBarato = lista.get(0);
        float menorPreco = maisBarato.getPreco();
        for (Produto p : lista) {
            if (p.getPreco() < menorPreco) {
                maisBarato = p;
                menorPreco = p.getPreco();
            }
        }
        return maisBarato; 
    }

    public static void main(String[] args) {
        Produto[] produtos = new Produto[]{
            new Produto(1001, "Arroz",   8.99f, 65),
            new Produto(1002, "Feijão",  6.99f, 24),
            new Produto(1003, "Milho",   4.99f, 75),
            new Produto(1004, "Batata",  2.99f, 34),
            new Produto(1005, "Cebola",  1.99f, 52),
            new Produto(1006, "Tomate",  3.99f, 21),
            new Produto(1007, "Alface",  5.99f, 75),
            new Produto(1008, "Ervilha", 7.99f, 84),
        };

        List<Produto> listaProdutos = new ArrayList<>();
        for (Produto p : produtos) {
           listaProdutos.add(p);
        }
        System.out.println(buscaMenorPreco(listaProdutos));
    }
}

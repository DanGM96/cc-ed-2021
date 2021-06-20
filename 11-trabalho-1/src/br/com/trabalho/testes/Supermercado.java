package br.com.trabalho.testes;

import br.com.trabalho.classes.Cliente;
import br.com.trabalho.estruturadedados.FilaComPrioridade;

public class Supermercado {
    
    public static void main(String[] args) {
        // {1: idoso, 2: gestante, 3: max 15 itens, 4: demais clientes}
        Cliente[] clientes = new Cliente[]{
            new Cliente("c1", 23, 4),
            new Cliente("c2", 15, 3),
            new Cliente("c3", 17, 2),
            new Cliente("c4", 10, 1),
            new Cliente("c5", 40, 4),
            new Cliente("c6",  1, 3),
            new Cliente("c7", 12, 2),
            new Cliente("c8", 21, 1),
        };
        // Ordem esperada: c4 c8 c3 c7 c2 c6 c1 c5

        FilaComPrioridade<Cliente> fila = new FilaComPrioridade<Cliente>();

        System.out.println("\n--- Fila do Supermercado ---");
        for (Cliente c : clientes) {
            fila.enfileirar(c);
        }
        
        System.out.println(fila.toString());
        System.out.println("Chamando cliente: " + fila.desenfileira());
        System.out.println(fila.toString());
    }
}

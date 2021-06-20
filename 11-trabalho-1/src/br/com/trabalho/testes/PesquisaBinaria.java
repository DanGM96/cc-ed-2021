package br.com.trabalho.testes;

import br.com.trabalho.estruturadedados.Arvore;

public class PesquisaBinaria {

    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        // 8 -> (4 -> (2 -> (1, 3), 6 -> (5)), 12 -> (10 -> (11), 14 -> (13, 15)))
        int[] nums = {8, 4, 12, 2, 6, 10, 14, 1, 3, 5, 11, 13, 15};

        System.out.println("Os valores da nossa Arvore Binária são:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
            arvore.insereNo(nums[i] );
        }

        System.out.println("\n\npreOrdem Transversal");
        arvore.preOrdemTransversal();

        System.out.println("\n\ninOrdem Transversal");
        arvore.inOrdemTransversal();

        System.out.println("\n\nposOrdem Transversal");
        arvore.posOrdemTransversal();
    }
}

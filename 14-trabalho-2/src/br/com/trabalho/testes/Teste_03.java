package br.com.trabalho.testes;

import java.util.ArrayList;
import java.util.List;

public class Teste_03 {

    public static void removerRepetidos(List<Integer> lista) {
        for(int i = 0; i < lista.size(); i++){
            int atual = lista.get(i);
            int posiFinal = lista.lastIndexOf(atual);
            while(i != posiFinal){
                lista.remove(posiFinal);
                posiFinal = lista.lastIndexOf(atual);
            }
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {8, 4, 12, 2, 6, 10, 8, 4, 12, 2, 6, 10, 14, 1, 3, 5, 11, 13, 15, 14, 1, 3, 5, 11, 13, 15};

        List<Integer> listaInt = new ArrayList<>();
        for (int n : nums) {
            listaInt.add(n);
        }

        System.out.println("Lista original");
        System.out.println(listaInt);
        removerRepetidos(listaInt);
        System.out.println("Lista depois de removerRepetidos");
        System.out.println(listaInt);
    }
}

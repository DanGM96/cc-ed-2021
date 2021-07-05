package br.com.trabalho.testes;

import java.util.Stack;

public class Teste_09 {

    public static Stack<Integer> inverPilha(Stack<Integer> pilha) {

        if (pilha.isEmpty()){
            return null;
        }

        Stack<Integer> pilhaAux = new Stack<>();

        while(!pilha.isEmpty()){
            pilhaAux.push(pilha.pop());
        }

        return pilhaAux;
    }

    public static void main(String[] args){
        int[] nums = {8, 4, 12, 2, 6, 10, 14, 1, 3, 5, 11, 13, 15};
        
        Stack<Integer> pilha = new Stack<>();
        for (Integer i : nums) {
            pilha.push(i);
        }
        System.out.println(pilha);
        pilha = inverPilha(pilha);
        System.out.println(pilha);
    }
}

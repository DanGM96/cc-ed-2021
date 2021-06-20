package br.com.prova.testes;

import java.util.Scanner;

import br.com.prova.estruturadedados.Pilha;

public class Palindromo {

    public static void main(String[] args) {

        Pilha<Character> caracteres = new Pilha<Character>();
        String extra = "EXTRA";
        // Descomente o código para fazer o input no console
        /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira uma palavra: ");
        extra = scan.nextLine().toUpperCase();
        scan.close();
        */
        
        String[] palavras = new String[]{
            "AABCCBAA",
            "OVO",
            "ABFFBB",
            "PALINDROMO",
            "ACATACA",
            extra
        };

        System.out.println("Quais dessas palavras são palíndromos?");

        for(String p : palavras) {
            String palavraAtual = "";
            for(char c : p.toCharArray()) {
                caracteres.empilha(c);
            }
            while(!caracteres.estaVazia()) {
                palavraAtual += caracteres.desempilha();
            }
            System.out.println(p + ": " + (p.equals(palavraAtual)));
        }
    }
}

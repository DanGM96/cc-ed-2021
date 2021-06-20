package br.com.prova.testes;

import java.util.Random;
import java.util.Scanner;

import br.com.prova.estruturadedados.Pilha;

public class MenuPilha {

    private static Pilha<Integer> pilha = new Pilha<Integer>();

    public static void imprimirMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n------ Menu ------");
        System.out.println("1 - Empilhar elemento (número aleatório de 0 a 100)");
        System.out.println("2 - Desempilhar elemento");
        System.out.println("3 - Mostrar o topo");
        System.out.println("4 - Imprimir tudo, zerando a pilha");
        System.out.println("5 - Sair");
        System.out.print("Escolha um número: ");
        escolhaMenu(scan.nextLine());
        scan.close();
    }

    public static void escolhaMenu(String opcao) {
        Random rand = new Random();
        switch (opcao) {
            case "1":
                int num = rand.nextInt(101);
                pilha.empilha(num);
                System.out.println(num);
                break;
            case "2":
                System.out.println(pilha.desempilha());
                break;
            case "3":
                System.out.println(pilha.topo());
                break;
            case "4":
                while(!pilha.estaVazia()){
                    System.out.print(pilha.desempilha() + " ");
                }
                System.out.println();
                break;
            case "5":
                System.exit(0);
                break;
            default:
                break;
        }
        imprimirMenu();
    }

    public static void main(String[] args) {
        
        imprimirMenu();
    }
}

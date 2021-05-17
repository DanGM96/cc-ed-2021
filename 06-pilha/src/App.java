import java.util.Stack;
import java.util.Scanner;

public class App {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    
    public static Scanner scan = new Scanner(System.in);

    // 1. Escreva um programa que leia dez números. Para cada número lido, verifique e implemente de acordo com as regras a seguir:
    public static void exercicioUm(){
        System.out.println(GREEN + "--- Exercício Um ---" + RESET);
        Pilha<Integer> pilha = new Pilha<Integer>();
        //Scanner scan = new Scanner(System.in);
        int num;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Insira um número inteiro: ");
            num = Integer.parseInt(scan.nextLine());

            if (num % 2 == 0) {
                // Se o número for par, empilhe na pilha;
                pilha.empilha(num);
            } else {
                // Se o número for ímpar, desempilhar um número da pilha. Caso a pilha esteja vazia, mostre uma mensagem;
                if(pilha.desempilha() == null){
                    System.out.println(RED + "A pilha já está vazia!" + RESET);
                }
            }
        }
        scan.close();

        int tamanho = pilha.tamanho();
        if (tamanho > 0) {
            // Se ao final do programa a pilha não estiver vazia, desempilhar todos os elementos, imprimindo-os na tela.
            for (int i = 0; i < tamanho; i++) {
                System.out.println(GREEN + pilha.desempilha() + RESET);
            }
        } else {
            System.out.println(RED + "A pilha está completamente vazia." + RESET);
        }
    }

    // 2. Escreva um programa que leia 10 números. Para cada número lido, verifique e implemente de acordo com as regras a seguir:
    public static void exercicioDois(){
        System.out.println(GREEN + "--- Exercício Dois ---" + RESET);
        Pilha<Integer> par = new Pilha<Integer>();
        Pilha<Integer> impar = new Pilha<Integer>();
        //Scanner scan = new Scanner(System.in);
        int numero;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Insira um número inteiro: ");
            numero = Integer.parseInt(scan.nextLine());

            if (numero == 0) {
                // Se o número for zero (0), desempilhar um elemento de cada pilha. Caso alguma pilha esteja vazia, mostre uma mensagem de erro na tela;
                if(par.desempilha() == null){
                    System.out.println(RED + "A pilha PAR já está vazia!" + RESET);
                }
                if(impar.desempilha() == null){
                    System.out.println(RED + "A pilha ÍMPAR já está vazia!" + RESET);
                }

            } else if (numero % 2 == 0) {
                // Se o número for par, empilhe na pilha chamada par;
                par.empilha(numero);

            } else {
                // Se o número for ímpar, empilhe na pilha chamada ímpar;
                impar.empilha(numero);
            }
        }
        scan.close();

        int tamanhoPar = par.tamanho();
        if (tamanhoPar > 0) {
            // Ao final do programa desempilhar todos os elementos das duas pilhas, imprimindo-os na tela e apresentando qual número pertence a cada lista.
            for (int i = 0; i < tamanhoPar; i++) {
                System.out.println(GREEN + "Par: " + par.desempilha() + RESET);
            }
        } else {
            System.out.println(RED + "A pilha PAR está completamente vazia." + RESET);
        }

        int tamanhoImpar = impar.tamanho();
        if (tamanhoImpar > 0) {
            // Ao final do programa desempilhar todos os elementos das duas pilhas, imprimindo-os na tela e apresentando qual número pertence a cada lista.
            for (int i = 0; i < tamanhoImpar; i++) {
                System.out.println(GREEN + "Ímpar: " + impar.desempilha() + RESET);
            }
        } else {
            System.out.println(RED + "A pilha ÍMPAR está completamente vazia." + RESET);
        }
    }

    // 3. Utilize a classe Pilha e desenvolva os seguintes items:
    public static void exercicioTres(){
        System.out.println(GREEN + "--- Exercício Três ---" + RESET);

        // Crie uma pilha com capacidade para 20 livros;
        Pilha<Livro> livro = new Pilha<Livro>(20);

        // Cada livro contém nome, isbn, ano de lançamento e autor.
        Livro l1 = new Livro("Sol da meia-noite", "978-65-55600-29-2", 2019, "Stephenie Meyer");
        Livro l2 = new Livro("A garota do lago", "978-85-62409-88-2", 2017, "Charlie Donlea");
        Livro l3 = new Livro("A revolução dos bichos", "978-85-35909-55-5", 2005, "George Orwell");
        Livro l4 = new Livro("1984", "978-85-35914-84-9", 2009, "George Orwell");
        Livro l5 = new Livro("O homem de giz", "978-85-51002-93-3", 2018, "C. J. Tudor");
        Livro l6 = new Livro("O conto da Aia", "978-85-32520-66-1", 2017, "Margaret Atwood");
        Livro l7 = new Livro("Essa gente", "978-85-35932-95-9", 2019, "Chico Buarque");

        // Insira 6 livros na pilha;
        livro.empilha(l1);
        livro.empilha(l2);
        livro.empilha(l3);
        livro.empilha(l4);
        livro.empilha(l5);
        livro.empilha(l6);

        // Crie um exemplo para utilizar cada método da classe pilha.
        System.out.println(YELLOW + "estaVazia() " + RESET + livro.estaVazia());
        System.out.println(YELLOW + "topo() " + RESET + livro.topo());
        System.out.println(YELLOW + "empilha() " + RESET + livro.empilha(l7));
        System.out.println(YELLOW + "desempilha() " + RESET + livro.desempilha());
        System.out.println(YELLOW + "tamanho() " + RESET + livro.tamanho());
        System.out.println(YELLOW + "toString() " + RESET + livro.toString());
        
    }

    // 3. Utilize a classe Pilha e desenvolva os seguintes items:
    public static void exercicioQuatro(){
        System.out.println(GREEN + "--- Exercício Três ---" + RESET);

        // Crie uma pilha com capacidade para 20 livros;
        Stack<Livro> livro = new Stack<Livro>();

        // Cada livro contém nome, isbn, ano de lançamento e autor.
        Livro l1 = new Livro("Sol da meia-noite", "978-65-55600-29-2", 2019, "Stephenie Meyer");
        Livro l2 = new Livro("A garota do lago", "978-85-62409-88-2", 2017, "Charlie Donlea");
        Livro l3 = new Livro("A revolução dos bichos", "978-85-35909-55-5", 2005, "George Orwell");
        Livro l4 = new Livro("1984", "978-85-35914-84-9", 2009, "George Orwell");
        Livro l5 = new Livro("O homem de giz", "978-85-51002-93-3", 2018, "C. J. Tudor");
        Livro l6 = new Livro("O conto da Aia", "978-85-32520-66-1", 2017, "Margaret Atwood");
        Livro l7 = new Livro("Essa gente", "978-85-35932-95-9", 2019, "Chico Buarque");

        // Insira 6 livros na pilha;
        livro.push(l1);
        livro.push(l2);
        livro.push(l3);
        livro.push(l4);
        livro.push(l5);
        livro.push(l6);

        // Crie um exemplo para utilizar cada método da classe pilha.
        System.out.println(YELLOW + "isEmpty() " + RESET + livro.isEmpty());
        System.out.println(YELLOW + "peek() " + RESET + livro.peek());
        System.out.println(YELLOW + "push() " + RESET + livro.push(l7));
        System.out.println(YELLOW + "pop() " + RESET + livro.pop());
        System.out.println(YELLOW + "size() " + RESET + livro.size());
        System.out.println(YELLOW + "toString() " + RESET + livro.toString());
        
    }
   
    // Desafio 1: Conversão decimal-binário
    // Usando a classe Pilha ou Stack, desenvolva um algoritmo que faça a conversão de números decimais para binários.
    public static void desafioUm(){
        System.out.println(GREEN + "--- Desafio Um ---" + RESET);

        Pilha<Integer> binario = new Pilha<Integer>();
        System.out.println("Insira um número inteiro: ");
        int num = Integer.parseInt(scan.nextLine());

        while (num != 0) {
            int bin = num % 2;
            binario.empilha(bin);
            num /= 2;
        }
        System.out.printf("Número convertido em binário: ");

        int tamanho = binario.tamanho();
        if (tamanho > 0) {
            for (int i = 0; i < tamanho; i++) {
                System.out.printf(GREEN + binario.desempilha() + RESET);
            }
        }
    }

    // Desafio 2: Símbolos balanceados
    // Escreva uma programa para verificar se uma expressão matemática tem os parênteses agrupados de forma correta, isto é:
    public static void desafioDois(){
        System.out.println(GREEN + "--- Desafio Dois ---" + RESET);

        Pilha<Character> parenteses = new Pilha<Character>();
        System.out.printf("Insira uma expressão matemática: ");
        String expressao = scan.nextLine();
        
        for (int i = 0; i < expressao.length(); i++) {
            char simbolo = expressao.charAt(i);
            if(simbolo == '('){
                // SE o número de parênteses à esquerda e à direita são iguais e;
                parenteses.empilha(simbolo);
            } else if(simbolo == ')') {
                // se todos os parênteses aberto é seguido posteriormente por um fechamento de parênteses.
                if(parenteses.desempilha() == null){
                    System.out.println(RED + "Os símbolos NÃO estão balanceados!" + RESET);
                    return;
                }
            }
        }
        if(parenteses.estaVazia()){
            System.out.println(GREEN + "Os símbolos ESTÃO balanceados!" + RESET);
        } else {
            System.out.println(RED + "Os símbolos NÃO estão balanceados!" + RESET);
        }
    }

    public static void main(String[] args) throws Exception {
        
        System.out.println(GREEN + "--- Lista de Exercicios - Pilha ---" + RESET);
        System.out.println("1\tExercício Um");
        System.out.println("2\tExercício Dois");
        System.out.println("3\tExercício Três");
        System.out.println("4\tExercício Quatro");
        System.out.println("5\tDesafio Um");
        System.out.println("6\tDesafio Dois");
        System.out.println("Outro\tEncerrar programa");

        System.out.printf("\nInsira um número (das opções): ");
        int num = Integer.parseInt(scan.nextLine());
        
        switch (num) {
            case 1:
                exercicioUm();
                break;
            case 2:
                exercicioDois();
                break;
            case 3:
                exercicioTres();
                break;
            case 4:
                exercicioQuatro();
                break;
            case 5:
                desafioUm();
                break;
            case 6:
                desafioDois();
                break;
            default:
                scan.close();
                return;
        }

    }
}

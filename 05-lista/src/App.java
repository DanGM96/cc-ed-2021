import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        // Exercícios de 1 a 4 nas linhas 139 a 180 no arquivo Lista.java

        /*
            5. Utilizando a classe Lista e a classe contato e desenvolva os seguintes itens abaixo:
                i. Crie uma Lista com capacidade para 20 contatos;
                ii. Insira 30 contatos na lista;
                iii. imprima todos os elementos da lista;
        */

        Contato c1 = new Contato("c1", "111-1111", "c1@email.com.br");
        Contato c2 = new Contato("c2", "222-2222", "c2@email.com.br");
        Contato c3 = new Contato("c3", "333-3333", "c3@email.com.br");
        Contato c4 = new Contato("c4", "444-4444", "c4@email.com.br");
        Contato c5 = new Contato("c5", "555-5555", "c5@email.com.br");
        Contato c6 = new Contato("c6", "666-6666", "c6@email.com.br");
        Contato c7 = new Contato("c7", "777-7777", "c7@email.com.br");
        Contato c8 = new Contato("c8", "888-8888", "c8@email.com.br");
        Contato c9 = new Contato("c9", "999-9999", "c9@email.com.br");
        Contato c10 = new Contato("c10", "101010-10101010", "c10@email.com.br");
        Contato c11 = new Contato("c11", "111111-11111111", "c11@email.com.br");
        Contato c12 = new Contato("c12", "121212-12121212", "c12@email.com.br");
        Contato c13 = new Contato("c13", "131313-13131313", "c13@email.com.br");
        Contato c14 = new Contato("c14", "141414-14141414", "c14@email.com.br");
        Contato c15 = new Contato("c15", "151515-15151515", "c15@email.com.br");
        Contato c16 = new Contato("c16", "161616-16161616", "c16@email.com.br");
        Contato c17 = new Contato("c17", "171717-17171717", "c17@email.com.br");
        Contato c18 = new Contato("c18", "181818-18181818", "c18@email.com.br");
        Contato c19 = new Contato("c19", "191919-19191919", "c19@email.com.br");
        Contato c20 = new Contato("c20", "202020-20202020", "c20@email.com.br");
        Contato c21 = new Contato("c21", "212121-21212121", "c21@email.com.br");
        Contato c22 = new Contato("c22", "222222-22222222", "c22@email.com.br");
        Contato c23 = new Contato("c23", "232323-23232323", "c23@email.com.br");
        Contato c24 = new Contato("c24", "242424-24242424", "c24@email.com.br");
        Contato c25 = new Contato("c25", "252525-25252525", "c25@email.com.br");
        Contato c26 = new Contato("c26", "262626-26262626", "c26@email.com.br");
        Contato c27 = new Contato("c27", "272727-27272727", "c27@email.com.br");
        Contato c28 = new Contato("c28", "282828-28282828", "c28@email.com.br");
        Contato c29 = new Contato("c29", "292929-29292929", "c29@email.com.br");
        Contato c30 = new Contato("c30", "303030-30303030", "c30@email.com.br");
        
        Lista<Contato> vetor =  new Lista<Contato>(20);

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);
        vetor.adiciona(c4);
        vetor.adiciona(c5);
        vetor.adiciona(c6);
        vetor.adiciona(c7);
        vetor.adiciona(c8);
        vetor.adiciona(c9);
        vetor.adiciona(c10);
        vetor.adiciona(c11);
        vetor.adiciona(c12);
        vetor.adiciona(c13);
        vetor.adiciona(c14);
        vetor.adiciona(c15);
        vetor.adiciona(c16);
        vetor.adiciona(c17);
        vetor.adiciona(c18);
        vetor.adiciona(c19);
        vetor.adiciona(c20);
        vetor.adiciona(c21);
        vetor.adiciona(c22);
        vetor.adiciona(c23);
        vetor.adiciona(c24);
        vetor.adiciona(c25);
        vetor.adiciona(c26);
        vetor.adiciona(c27);
        vetor.adiciona(c28);
        vetor.adiciona(c29);
        vetor.adiciona(c30);
        
        System.out.println("\n--- Lista ---");
        System.out.println(vetor);


        // 6. Utilizando a classe LinkedList refaça todos os itens da questão 5;

        LinkedList<Contato> listaEncadeada = new LinkedList<Contato>();

        listaEncadeada.add(c1);
		listaEncadeada.add(c2);
		listaEncadeada.add(c3);
		listaEncadeada.add(c4);
		listaEncadeada.add(c5);
		listaEncadeada.add(c6);
		listaEncadeada.add(c7);
		listaEncadeada.add(c8);
		listaEncadeada.add(c9);
		listaEncadeada.add(c10);
		listaEncadeada.add(c11);
		listaEncadeada.add(c12);
		listaEncadeada.add(c13);
		listaEncadeada.add(c14);
		listaEncadeada.add(c15);
		listaEncadeada.add(c16);
		listaEncadeada.add(c17);
		listaEncadeada.add(c18);
		listaEncadeada.add(c19);
		listaEncadeada.add(c20);
		listaEncadeada.add(c21);
		listaEncadeada.add(c22);
		listaEncadeada.add(c23);
		listaEncadeada.add(c24);
		listaEncadeada.add(c25);
		listaEncadeada.add(c26);
		listaEncadeada.add(c27);
		listaEncadeada.add(c28);
		listaEncadeada.add(c29);
		listaEncadeada.add(c30);

        System.out.println("\n--- LinkedList ---");
		System.out.println(listaEncadeada);
    }
}

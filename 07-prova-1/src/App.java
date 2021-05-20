import java.util.Comparator;

public class App {

    public static void main(String[] args) throws Exception {
 
        ConsoleColor cabecalho = new ConsoleColor(new ConsoleColor(48, 5, 8), ConsoleColor.FG_BLACK);

        Contato c1 = new Contato("c1", "111-1111", "c1@email.com.br");
        Contato c2 = new Contato("c2", "222-2222", "c2@email.com.br");
        Contato c3 = new Contato("c3", "333-3333", "c3@email.com.br");
        Contato c4 = new Contato("c4", "444-4444", "c4@email.com.br");
        Contato c5 = new Contato("c5", "555-5555", "c5@email.com.br");

        // Exercícios de 1.1 a 1.3 nas linhas 179 a 213 no arquivo Lista.java
        System.out.println();
        ConsoleColor.prettyPrint(cabecalho, "*** Exercício 1 ***");

        // 1.4. Crie uma classe com o método main e implemente os testes das alternativas anteriores.        
        Lista<Contato> listaUm =  new Lista<Contato>(5);
        listaUm.adiciona(c1);
        listaUm.adiciona(c2);
        listaUm.adiciona(c3);
        listaUm.adiciona(c4);
        listaUm.adiciona(c5);
        
        System.out.println();
        ConsoleColor.prettyPrint(ConsoleColor.FG_YELLOW, "--- Lista 1 ---");
        System.out.println(listaUm);

        // 1.1. Faça um método que inverta todos os elementos de uma Lista;
        System.out.println();
        ConsoleColor.prettyPrint(ConsoleColor.FG_YELLOW, "--- Lista 1 + inverterLista ---");
        listaUm.inverterLista();
        System.out.println(listaUm);

        // 1.2. Faça um método que adiciona um elemento na lista de forma ordenada;
        System.out.println();
        ConsoleColor.prettyPrint(ConsoleColor.FG_YELLOW, "--- Lista 1 + adicionaOrdenada ---");
        listaUm.adicionaOrdenada(c2, new Comparator<Contato>(){
            @Override
            public int compare(Contato o1, Contato o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        System.out.println(listaUm);


        Lista<Contato> listaDois =  new Lista<Contato>(5);
        listaDois.adiciona(c1);
        listaDois.adiciona(c2);
        listaDois.adiciona(c3);
        listaDois.adiciona(c4);
        listaDois.adiciona(c5);
        
        System.out.println();
        ConsoleColor.prettyPrint(ConsoleColor.FG_YELLOW, "--- Lista 2 ---");
        System.out.println(listaDois);

        // 1.3. Faça um método que ao receber uma outra lista, ele retorne uma nova lista com a intercalação dos elementos da lista atual com a lista informada por parâmetro;
        System.out.println();
        ConsoleColor.prettyPrint(ConsoleColor.FG_YELLOW, "--- Lista 1 & 2 + intercalarCom ---");
        System.out.println(listaUm.intercalarCom(listaDois));

        
        /*
        2. Utilizando a estrutura de dados List (ApiJava) faça um programa que faça uma lista se comportar como uma pilha, ou seja a lista tem que inserir e remover na última posição. Crie uma classe nova chamada ListaPilha utilizando como atributo um objeto List e implemente o método adicionar e remover conforme descrito acima. Faça uma classe com o método main e demonstre o funcionamento da nova classe. (4 pontos)
        */
        // Exercício 2 no arquivo ListaPilha.java
        System.out.println();
        ConsoleColor.prettyPrint(cabecalho, "*** Exercício 2 ***");
        ListaPilha<Contato> listaPilha = new ListaPilha<Contato>();
        
        System.out.println();
        ConsoleColor.prettyPrint(ConsoleColor.FG_YELLOW, "--- ListaPilha + adicionar ---");
        System.out.println(listaPilha.adicionar(c1));
        
        System.out.println();
        ConsoleColor.prettyPrint(ConsoleColor.FG_YELLOW, "--- ListaPilha + remover ---");
        System.out.println(listaPilha.remover());
        
        
        /*
        3. Utilizando estrutura de dados LinkedList (ApiJava) gere uma classe Chamada ListaLigada e que tenha como atributo um objeto LinkedList, e possua os seguintes métodos: (4 pontos)
        */
        // Exercício 3 no arquivo ListaLigada.java
        System.out.println();
        ConsoleColor.prettyPrint(cabecalho, "*** Exercício 3 ***");

        // 3.1. Implemente todos os métodos descrito no exercício 1;
        ListaLigada<Contato> listaLigadaUm = new ListaLigada<Contato>();
        listaLigadaUm.add(c1);
        listaLigadaUm.add(c2);
        listaLigadaUm.add(c3);
        listaLigadaUm.add(c4);
        listaLigadaUm.add(c5);

        System.out.println();
        ConsoleColor.prettyPrint(ConsoleColor.FG_YELLOW, "--- ListaLigada ---");
        System.out.println(listaLigadaUm);

        // 3.1.1. Faça um  método que inverta todos os elementos de uma Lista;
        System.out.println();
        ConsoleColor.prettyPrint(ConsoleColor.FG_YELLOW, "--- ListaLigada + inverterLista ---");
        listaLigadaUm.inverterLista();
        System.out.println(listaLigadaUm);

        // 3.1.2. Faça um método que adiciona um elemento na lista de forma ordenada;
        System.out.println();
        ConsoleColor.prettyPrint(ConsoleColor.FG_YELLOW, "--- ListaLigada + adicionaOrdenada ---");
        listaLigadaUm.adicionaOrdenada(c2, new Comparator<Contato>(){
            @Override
            public int compare(Contato o1, Contato o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        System.out.println(listaLigadaUm);
        
        ListaLigada<Contato> listaLigadaDois = new ListaLigada<Contato>();
        listaLigadaDois.add(c1);
        listaLigadaDois.add(c2);
        listaLigadaDois.add(c3);
        listaLigadaDois.add(c4);
        listaLigadaDois.add(c5);

        // 3.1.3. Faça um método que ao receber uma outra lista, ele retorne uma nova lista com a intercalação dos elementos da lista atual com a lista informada por parâmetro;
        System.out.println();
        ConsoleColor.prettyPrint(ConsoleColor.FG_YELLOW, "--- ListaLigada 1 & 2 + intercalarCom ---");
        System.out.println(listaLigadaUm.intercalarCom(listaLigadaDois));

        // 3.2. Implemente um método que ao receber uma lista por parâmetro, ele realiza a união das lista atual com a lista passada por parâmetro e produz uma nova lista;
        System.out.println();
        ConsoleColor.prettyPrint(ConsoleColor.FG_YELLOW, "--- ListaLigada 1 & 2 + unirCom ---");
        System.out.println(listaLigadaUm.unirCom(listaLigadaDois));
    }
}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        //ArrayList<String> lista = new ArrayList<String>();

        List<String> lista = new ArrayList<String>();

        LinkedList<Contato> listaEncadeada = new LinkedList<Contato>();
                      
        /*lista.add("C");
        lista.add("D");
        lista.add(0, "A");
        lista.add(1, "B");
        boolean bool = lista.contains("F");
        System.out.println(lista.get(2));
        System.out.println(lista.size());
        lista.remove(1);
        System.out.println(lista.indexOf("D"));
        System.out.println(lista);
        System.out.println(bool);
        /*Lista<Contato> vetor =  new Lista<Contato>(2);*/

        Contato c1 = new Contato("c1", "111-1111", "c1@email.com.br");
        Contato c2 = new Contato("c2", "222-2222", "c2@email.com.br");
        Contato c3 = new Contato("c3", "333-3333", "c3@email.com.br");
        Contato c4 = new Contato("c4", "444-4444", "c4@email.com.br");
        Contato c5 = new Contato("c5", "555-5555", "c5@email.com.br");

        listaEncadeada.add(c1);
        listaEncadeada.add(c3);
        listaEncadeada.add(1, c2);
        System.out.println(listaEncadeada.contains(c1));
        listaEncadeada.addFirst(c5);
        listaEncadeada.addLast(c4);
        listaEncadeada.remove();
        listaEncadeada.removeLast();
        System.out.println(listaEncadeada);
                   
        //try {

            /*vetor.adiciona(c1);
            vetor.adiciona(c2);
            vetor.adiciona(c3);*/
           // System.out.println(vetor);
            //vetor.adiciona("A");
           // vetor.adiciona(2);
            //System.out.println(vetor);
            /*vetor.adiciona(2);
            vetor.adiciona(4);
            vetor.adiciona(5);
            System.out.println(vetor);
            vetor.adiciona(0, 1);
            System.out.println(vetor);
            vetor.adiciona(2, 3);
            System.out.println(vetor);
            vetor.remover(1);
            System.out.println(vetor);*/
           // System.out.println(vetor.busca(2));
            //System.out.println(vetor.busca("elemento 4"));
            //System.out.println(vetor.toString());
            //System.out.println(vetor.tamanho());
       /*} catch (IllegalAccessException e) {
            e.printStackTrace();
        }*/  
        

    }
}

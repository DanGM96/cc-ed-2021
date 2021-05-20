import java.util.Comparator;
import java.util.LinkedList;

public class ListaLigada<T> extends LinkedList<T> {
    
    // 3.1.1. Faça um  método que inverta todos os elementos de uma Lista;
    public void inverterLista() {
        T aux;
        for (int i = 0, j = this.size() - 1; i < j; i++, j--) {
            aux = this.get(i);
            this.set(i, this.get(j));
            this.set(j, aux);
        }
    }
    
    // 3.1.2. Faça um método que adiciona um elemento na lista de forma ordenada;
    public boolean adicionaOrdenada(T elemento, Comparator<T> comparador) {
        for (int i = 0; i < this.size(); i++) {
            if (comparador.compare(this.get(i), elemento) >= 0) {
                this.add(i, elemento);
                return true;
            }
        }
        return this.add(elemento);
    }

    // 3.1.3. Faça um método que ao receber uma outra lista, ele retorne uma nova lista com a intercalação dos elementos da lista atual com a lista informada por parâmetro;
    public ListaLigada<T> intercalarCom(ListaLigada<T> outro) {
        ListaLigada<T> novoVetor = new ListaLigada<T>();
        
        int maior = Math.max(this.size(), outro.size());
        for (int i = 0; i < maior; i++) {
            if (i < this.size()) {
                novoVetor.add(this.get(i));
            }
            if (i < outro.size()) {
                novoVetor.add(outro.get(i));
            }
        }
        return novoVetor;
    }

    // 3.2. Implemente um método que ao receber uma lista por parâmetro, ele realiza a união das lista atual com a lista passada por parâmetro e produz uma nova lista;
    public ListaLigada<T> unirCom(ListaLigada<T> outro) {
        ListaLigada<T> novoVetor = new ListaLigada<T>();
        novoVetor.addAll(this);
        novoVetor.addAll(outro);
        return novoVetor;
    }
}

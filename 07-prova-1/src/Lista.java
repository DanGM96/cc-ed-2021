import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Lista<T> {
    private T[] elementos;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public Lista(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    @SuppressWarnings("unchecked")
    public Lista(int capacidade, Class<T> tipoClasse){
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;        
    }  

    
    //adiciona o elemento no final
    public boolean adiciona(T elemento){
        this.aumentaCapacidade();
        if( this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
        
    }

    public boolean adiciona(int posicao, T elemento) throws IllegalAccessException{
        if(!(posicao >=0 && posicao < tamanho)){
            throw new IllegalAccessException("Posicao Invalida");
        }

        this.aumentaCapacidade();

        for (int i = this.tamanho-1; i >= posicao; i--) {
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    public int tamanho(){
        return this.tamanho;
    }

    @SuppressWarnings("unchecked")
    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length*2];
            for (int i = 0; i < elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public T busca(int posicao) throws IllegalAccessException{
        if(!(posicao >=0 && posicao < tamanho)){
            throw new IllegalAccessException("Posicao Invalida");
        }
        return this.elementos[posicao];
    }

    public int busca(T elemento){
        for (int i = 0; i < this.tamanho; i++) {
            if(this.elementos[i].equals(elemento)){
                return i;
            }
            
        }
        return -1;
    }

    public void remover(int posicao) throws IllegalAccessException{
        if(!(posicao >=0 && posicao < tamanho)){
            throw new IllegalAccessException("Posicao Invalida");
        }

        for (int i = posicao; i < this.tamanho-1; i++) {
            this.elementos[i] = this.elementos[i+1];            
        }
        this.tamanho--;

    }

    @Override
    public String toString() {
        
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho-1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if(this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");
        
        return s.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.deepHashCode(elementos);
        result = prime * result + tamanho;
        return result;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Lista other = (Lista) obj;
        if (!Arrays.deepEquals(elementos, other.elementos))
            return false;
        if (tamanho != other.tamanho)
            return false;
        return true;
    }

    public boolean contem(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if(this.elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public int ultimoIndiceDe(T elemento) {
        for (int i = this.tamanho - 1; i >= 0; i--) {
            if(this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public void remove(T elemento){
        for (int i = 0; i < this.tamanho; i++) {

            if(this.elementos[i].equals(elemento)) {

                for (int j = i; j < this.tamanho - 1; j++) {
                    this.elementos[j] = this.elementos[j + 1];
                }
                this.tamanho--;
                break; // Retire o break se quiser remover todas as aparições do mesmo elemento na lista
            }
        }
    }

    public void limpar() {
        for (int i = 0; i < this.tamanho; i++) {
            this.elementos[i] = null;
        }
        this.tamanho = 0;
    }

    // 1.1. Faça um  método que inverta todos os elementos de uma Lista;
    @SuppressWarnings("unchecked")
    public void inverterLista() throws IllegalAccessException {
        T[] elementosNovos = (T[]) new Object[this.tamanho];
        for (int i = 0; i < this.tamanho; i++) {
            elementosNovos[this.tamanho - 1 - i] = elementos[i];
        }
        this.elementos = elementosNovos;
    }

    // 1.2. Faça um método que adiciona um elemento na lista de forma ordenada;
    public boolean adicionaOrdenada(T elemento, Comparator<T> comparador) throws IllegalAccessException {
        this.aumentaCapacidade();
        for (int i = 0; i < this.tamanho; i++) {
            if (comparador.compare(this.elementos[i], elemento) >= 0) {
                return adiciona(i, elemento);
            }
        }
        return adiciona(elemento);
    }

    // 1.3. Faça um método que ao receber uma outra lista, ele retorne uma nova lista com a intercalação dos elementos da lista atual com a lista informada por parâmetro;
    public Lista<T> intercalarCom(Lista<T> outro) {
        Lista<T> novoVetor = new Lista<T>(this.tamanho + outro.tamanho);
        
        int maior = Math.max(this.tamanho, outro.tamanho);
        for (int i = 0; i < maior; i++) {
            if (i < this.tamanho) {
                novoVetor.adiciona(this.elementos[i]);
            }
            if (i < outro.tamanho) {
                novoVetor.adiciona(outro.elementos[i]);
            }
        }
        return novoVetor;
    }
}

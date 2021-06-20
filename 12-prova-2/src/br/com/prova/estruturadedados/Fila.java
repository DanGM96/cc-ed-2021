package br.com.prova.estruturadedados;

public class Fila<T> {

    private T[] elementos;
    private int tamanho;

    public Fila(){
        this(10);
    }

    @SuppressWarnings("unchecked")
    public Fila(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public boolean estaVazia(){
        return this.tamanho == 0;
    }

    public boolean enfileirar(T elemento){
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;

    }

    public boolean enfileirar(int posicao, T elemento) throws IllegalAccessException {
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

    @SuppressWarnings("unchecked")
    private void aumentaCapacidade(){
		if (this.tamanho == this.elementos.length){
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i=0; i<this.elementos.length; i++){
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

    public T espiar(){
        if(this.estaVazia()){
            return null;
        }
        return this.elementos[0];
    }

    public T desenfileira(){

        final int POS = 0;

        if(this.estaVazia()){
            return null;
        }
        T  elementoRemovido = this.elementos[POS];
        for (int i = 0; i < tamanho-1; i++) {
            elementos[i] = elementos[i+1];
        }
        tamanho--;
        return elementoRemovido; 

    }

    public int tamanho(){
        return this.tamanho;
    }

    @Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for (int i=0; i<this.tamanho-1; i++){
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if (this.tamanho>0){
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
    
}

//package io.github.jiangdequan;

public class VetorObjetos {
    private Object[] elementos;
    private int tamanho;

    public VetorObjetos(int capacidade){
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }  

    
    //adiciona o elemento no final
    public boolean adiciona(Object elemento){
        this.aumentaCapacidade();
        if( this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
        
    }

    public boolean adiciona(int posicao, Object elemento) throws IllegalAccessException{
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

    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            Object[] elementosNovos = new Object[this.elementos.length*2];
            for (int i = 0; i < elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public Object busca(int posicao) throws IllegalAccessException{
        if(!(posicao >=0 && posicao < tamanho)){
            throw new IllegalAccessException("Posicao Invalida");
        }
        return this.elementos[posicao];
    }

    public int busca(Object elemento){
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
}
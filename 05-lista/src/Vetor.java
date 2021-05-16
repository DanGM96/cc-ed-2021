//import java.util.Arrays;

public class Vetor {
    
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    /*public void adiciona(String elemento){
        for (int i = 0; i < elementos.length; i++) {
            if(this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }
    }*/

    /*public void adiciona(String elemento) throws Exception{
        
        if( this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }else{
            throw new Exception("vetor está cheio!!!");
        }
    }*/

    
    //adiciona o elemento no final
    public boolean adiciona(String elemento){
        this.aumentaCapacidade();
        if( this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
        
    }

    public boolean adiciona(int posicao, String elemento) throws IllegalAccessException{
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
            String[] elementosNovos = new String[this.elementos.length*2];
            for (int i = 0; i < elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public String busca(int posicao) throws IllegalAccessException{
        if(!(posicao >=0 && posicao < tamanho)){
            throw new IllegalAccessException("Posicao Invalida");
        }
        return this.elementos[posicao];
    }

    public int busca(String elemento){
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
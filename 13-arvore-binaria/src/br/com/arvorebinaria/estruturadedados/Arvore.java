package br.com.arvorebinaria.estruturadedados;

public class Arvore {

    private No raiz;

    //construtor inicializar um arvore vazia
    public Arvore(){
        this.raiz = null;
    }
    
    //inserir um novo nó na árvore de pesquisa binária
    public void insereNo(int valorIsercao){
        if(this.raiz == null){
            //criar Nó raiz
            this.raiz = new No(valorIsercao);
        }else{
            //chama o metodo insere do Nó
            this.raiz.insereNo(valorIsercao);
        }
    }

    public void preOrdemTransversal(){
        preOrdemAuxiliar(this.raiz);
    }

    private void preOrdemAuxiliar(No no) {
        if(no == null){
            return;
        }
        System.out.printf(" %d ",no.valor);//gera saída de dados do nó
        preOrdemAuxiliar(no.noEsquerdo);//precorre subárvore esquerda
        preOrdemAuxiliar(no.noDireito);//precorre subárvore a direita
    }

    public void inOrdemTransversal(){
        inOrdemAuxiliar(this.raiz);
    }

    private void inOrdemAuxiliar(No no) {
        if(no == null){
            return;
        }        
        inOrdemAuxiliar(no.noEsquerdo);//precorre subárvore esquerda
        System.out.printf(" %d ",no.valor);//gera saída de dados do nó
        inOrdemAuxiliar(no.noDireito);//precorre subárvore a direita
    }

    public void posOrdemTransversal(){
        posOrdemAuxiliar(this.raiz);
    }

    private void posOrdemAuxiliar(No no) {
        if(no == null){
            return;
        }        
        posOrdemAuxiliar(no.noEsquerdo);//precorre subárvore esquerda        
        posOrdemAuxiliar(no.noDireito);//precorre subárvore a direita
        System.out.printf(" %d ",no.valor);//gera saída de dados do nó
    }

    public boolean busca(int valor){
        return buscaAuxiliar(this.raiz, valor);
    }

    private boolean buscaAuxiliar(No no, int valor){
        while(no != null) {                 // percorre a árvore até o fim
            if(valor > no.valor){           // caso maior, vai pra direita
                no = no.noDireito;
            } else if(valor < no.valor){    // caso menor, vai pra esquerda
                no = no.noEsquerdo;
            } else {                        // só cai aqui se valor == no.valor
                return true;
            }
        }
        return false;
    }
        
    public void removeNo(int valor){
        removeNoAuxiliar(this.raiz, valor);
    }

    private No removeNoAuxiliar(No no, int value) {
        if (no == null){
            return no;
        }
        if (value < no.valor) {
            no.noEsquerdo = removeNoAuxiliar(no.noEsquerdo, value);
        } else if (value > no.valor) {
            no.noDireito = removeNoAuxiliar(no.noDireito, value);
        } else {
            if (no.noEsquerdo == null) {
                return no.noDireito;
            } else if (no.noDireito == null){
                return no.noEsquerdo;
            }
            no.valor = substituirValor(no.noDireito);
            no.noDireito = removeNoAuxiliar(no.noDireito, no.valor);
        }
        return no;
    }
    
    private int substituirValor(No no) {
        int novoValor = no.valor;
        while (no.noEsquerdo != null) {
            novoValor = no.noEsquerdo.valor;
            no = no.noEsquerdo;
        }
        return novoValor;
    }
}

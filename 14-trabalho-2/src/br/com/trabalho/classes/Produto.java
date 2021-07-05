package br.com.trabalho.classes;

public class Produto implements Comparable<Produto> {
    private int codigo;
    private String nome;
    private float preco;
    private int qtd;

    public Produto(){}

    /**
     * @param codigo : Código
     * @param nome   : Nome
     * @param preco  : Preço
     * @param qtd    : Quantidade
     */
    public Produto(int codigo, String nome, float preco, int qtd){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    /**
     * @return int return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return float return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }

    /**
     * @return int return the qtd
     */
    public int getQtd() {
        return qtd;
    }

    /**
     * @param qtd the qtd to set
     */
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "Produto(" + codigo + ", " + nome + ", " + preco + ", " + qtd + ")";
    }

    @Override
    public int compareTo(Produto p) {
        return Float.valueOf(this.getPreco()).compareTo(p.getPreco());
    }
}

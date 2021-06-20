package br.com.trabalho.classes;

public class Cliente implements Comparable<Cliente> {

    private String nome;
    private Integer qntItens;
    private Integer prioridade;

    public Cliente() {}
    
    /**
     * @param nome
     * @param qntItens
     * @param prioridade
     */
    public Cliente(String nome, Integer qntItens, Integer prioridade) {
        this.nome = nome;
        this.qntItens = qntItens;
        this.prioridade = prioridade;
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
     * @return Integer return the qntItens
     */
    public Integer getQntItens() {
        return qntItens;
    }

    /**
     * @param qntItens the qntItens to set
     */
    public void setQntItens(Integer qntItens) {
        this.qntItens = qntItens;
    }

    /**
     * @return Integer return the prioridade
     */
    public Integer getPrioridade() {
        return prioridade;
    }

    /**
     * @param prioridade the prioridade to set
     */
    public void setPrioridade(Integer prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "C(" + nome + ", " + qntItens + ", " + prioridade + ")";
    }

    @Override
    public int compareTo(Cliente o) {
        return this.prioridade.compareTo(o.getPrioridade());
    }

}

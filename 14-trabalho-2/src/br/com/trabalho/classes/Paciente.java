package br.com.trabalho.classes;

public class Paciente implements Comparable<Paciente> {

    private String nome;
    private String nascimento;
    private String sintoma;
    private Integer prioridade;

    public Paciente() {}
    
    /**
     * @param nome
     * @param nascimento
     * @param sintoma
     * @param prioridade
     */
    public Paciente(String nome, String nascimento, String sintoma, Integer prioridade) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.sintoma = sintoma;
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
     * @return String return the nascimento
     */
    public String getNascimento() {
        return nascimento;
    }

    /**
     * @param nascimento the nascimento to set
     */
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    /**
     * @return String return the sintoma
     */
    public String getSintoma() {
        return sintoma;
    }

    /**
     * @param sintoma the sintoma to set
     */
    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    /**
     * @return String return the prioridade
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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((nascimento == null) ? 0 : nascimento.hashCode());
        result = prime * result + ((sintoma == null) ? 0 : sintoma.hashCode());
        result = prime * result + ((prioridade == null) ? 0 : prioridade.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Paciente other = (Paciente) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (nascimento == null) {
            if (other.nascimento != null)
                return false;
        } else if (!nascimento.equals(other.nascimento))
            return false;
        if (sintoma == null) {
            if (other.sintoma != null)
                return false;
        } else if (!sintoma.equals(other.sintoma))
            return false;
        if (prioridade == null) {
            if (other.prioridade != null)
                return false;
        } else if (!prioridade.equals(other.prioridade))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "P(" + nome + ", " + nascimento + ", " + sintoma + ", " + prioridade + ")";
    }

    @Override
    public int compareTo(Paciente p) {
        return this.getPrioridade().compareTo(p.getPrioridade());
    }

}

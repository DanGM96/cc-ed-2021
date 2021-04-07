public class Miranha {
    
    private static int miranhaNum = 1;
    private String nome;
    private Miranha outro1;
    private Miranha outro2;

    public Miranha(){
        this.nome = "Miranha " + miranhaNum;
        miranhaNum++;
    }

    /**
     * @return Miranha return the outro1
     */
    public Miranha getOutro1() {
        return outro1;
    }

    /**
     * @param outro1 the outro1 to set
     */
    public void setOutro1(Miranha outro1) {
        this.outro1 = outro1;
    }

    /**
     * @return Miranha return the outro2
     */
    public Miranha getOutro2() {
        return outro2;
    }

    /**
     * @param outro2 the outro2 to set
     */
    public void setOutro2(Miranha outro2) {
        this.outro2 = outro2;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    @Override
    public String toString(){
        return this.getNome();
    }
}

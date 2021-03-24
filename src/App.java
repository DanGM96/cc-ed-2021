
public class App {

    public static void printarInformacao(Infomacao infomacao) {
        System.out.println("Código de Área: " + infomacao.codigoArea);
        System.out.println("Código de Área 2: " + infomacao.codigoArea2);
        System.out.println("Idade da Cidade: " + infomacao.idadeCidade);
        System.out.println("Alfabeto desatualizado: " + new String(infomacao.alfabetoDesatualizado));
        System.out.println("População da Cidade: " + infomacao.populacaoCidade);
        System.out.println("Telefone: " + infomacao.telefone);
        System.out.println("Salário: " + infomacao.salario);
        System.out.println("Pi: " + infomacao.pi);
        System.out.println("Cidade Habitável: " + infomacao.cidadeHabitavel);
    }

    public static void main(String[] args) throws Exception {
        Infomacao infomacao = new Infomacao();
        printarInformacao(infomacao);
    }

}

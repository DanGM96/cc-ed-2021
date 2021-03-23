
public class App {

    public static void printarInformacao(Infomacao infomacao){
        System.out.println("Código de Área: " + infomacao.codigoArea);
        System.out.println("Código de Área 2: " + infomacao.codigoArea2);
        System.out.println("Idade da Cidade: " + infomacao.idadeCidade);
        System.out.println("Alfabeto desatualizado: " + new String(infomacao.alfabetoDesatualizado));
        System.out.println("População da Cidade: " + infomacao.populacaoCidade);
        System.out.println("Telefone: " + infomacao.telefone);
        System.out.println("Salário: " + infomacao.salario);
        System.out.println("Pi: " + infomacao.pi);
        System.out.println("Cidade Habitável: " + infomacao.cidadeHabitavel);
        System.out.println("Código Complex: " + infomacao.codigoComplex);
        System.out.println("Tem academia: " + infomacao.temAcademia);
        System.out.println("Tem base naval: " + infomacao.temBaseNaval);
        System.out.println("Tem campo de futebol: " + infomacao.temCampoFutebol);
        System.out.println("Tem covid: " + infomacao.temCovid);
        System.out.println("Tem hospital: " + infomacao.temHospital);
        System.out.println("Tem vacina: " + infomacao.temVacina);
    }

    public static void main(String[] args) throws Exception {
        Infomacao infomacao = new Infomacao();
        printarInformacao(infomacao);
    }

}

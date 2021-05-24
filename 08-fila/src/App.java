public class App {
    
    private static Fila<Paciente> fila = new Fila<Paciente>();
    private static int indexVermelho = -1;
    private static int indexAmarelo = -1;

    // 3. Desenvolva o método boolean enfileiraComPrioridade(Paciente paciente);
    public static boolean enfileiraComPrioridade(Paciente paciente) throws IllegalAccessException {
        switch (paciente.getPrioridade().toLowerCase()) {
            case "vermelho":
                fila.enfileirar(++indexVermelho, paciente);
                indexAmarelo++;
                break;
            case "amarelo":
                fila.enfileirar(++indexAmarelo, paciente);
                break;
            case "verde":
                fila.enfileirar(paciente);
                break;
            default:
                System.out.println("Erro de prioridade: " + paciente.toString());
                return false;
        }
        return true;
    }

    // Necessário para manter a posição dos pacientes prioritários
    public static Paciente desenfileiraComPrioridade() {
        if (indexVermelho > -1) {
            indexVermelho--;
        }
        if (indexAmarelo > -1) {
            indexAmarelo--;
        }
        return fila.desenfileira();
    }

    public static void main(String[] args) {

        Paciente p1 = new Paciente("p1", "2001-01-01", "Coceira", "Verde");
        Paciente p2 = new Paciente("p2", "2002-02-02", "Diarreia", "Amarelo");
        Paciente p3 = new Paciente("p3", "2003-03-03", "Hemorragia interna", "Vermelho");
        Paciente p4 = new Paciente("p4", "2004-04-04", "Dor de barriga", "Verde");
        Paciente p5 = new Paciente("p5", "2005-05-05", "Incontinência urinária", "Amarelo");
        Paciente p6 = new Paciente("p6", "06-06-2006", "Fratura exposta", "Vermelho");

        // Ordem esperada: p3 p6 p2 p5 p1 p4
        try {
            enfileiraComPrioridade(p1);
            enfileiraComPrioridade(p2);
            enfileiraComPrioridade(p3);
            enfileiraComPrioridade(p4);
            enfileiraComPrioridade(p5);
            enfileiraComPrioridade(p6);
        } catch (Exception e) {

        }

        System.out.println();
        System.out.println("Chamando paciente: " + desenfileiraComPrioridade());
        System.out.println();
        System.out.println(fila.toString());

        /*
            EXPLICAÇÃO:
            - Evitei mudar a classe Fila, mas adicionei o método enfileirar(posicao, elemento)
            - Criei duas variáveis para guardar a posição dos pacientes com prioridade Vermelho e Amarelo
            - Os de prioridade Verde não tem prioridade sobre ninguém, então não precisa guardar a posição
            - Para manter a prioridade e não estourar a posição, criei desenfileiraComPrioridade()
        */
    }
}

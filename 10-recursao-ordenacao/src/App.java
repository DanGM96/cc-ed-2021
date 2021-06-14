public class App {

    public static void main(String[] args) {
        
        // 1. Faça um algoritmo recursivo que implemente a sequência fibonacci;
        int CASA = 7;   // Casa de Fibonacci a ser encontrada
        System.out.println(Fibonacci.fibonacci(CASA));

        // 2.
        int[] vetor = {3, 5, 7, 1, 6, 2, 8, 9, 4, 10};
        //Ordenacao.insertionSort(vetor, 0, vetor.length - 1);
        //Ordenacao.selectionSort(vetor, 0, vetor.length - 1);
        //Ordenacao.bubbleSort(vetor, 0, vetor.length - 1);
        // 3.
        Ordenacao.quickSort(vetor, 0, vetor.length - 1);
        //Ordenacao.mergeSort(vetor, 0, vetor.length - 1);
        
        //imprenssão do vetor ordenado
        for (int i : vetor) {
            System.out.print(i + " ");
        }

        // 4.
        Paciente[] pacientes = new Paciente[]{
            new Paciente("p1", "2001-01-01", "Coceira", 3),
            new Paciente("p2", "2002-02-02", "Diarreia", 2),
            new Paciente("p3", "2003-03-03", "Hemorragia interna", 1),
            new Paciente("p4", "2004-04-04", "Dor de barriga", 3),
            new Paciente("p5", "2005-05-05", "Incontinência urinária", 2),
            new Paciente("p6", "06-06-2006", "Fratura exposta", 1),
        };

        Ordenacao.mergeSort(pacientes, 0, pacientes.length - 1);
        System.out.println();
        for (Paciente i : pacientes) {
            System.out.print(i + " ");
        }
    }
}

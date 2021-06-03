import java.util.Queue;
import java.util.Comparator;
import java.util.PriorityQueue;

public class App {

    public static void main(String[] args) {

        Paciente p1 = new Paciente("p1", "2001-01-01", "Coceira", 3);
        Paciente p2 = new Paciente("p2", "2002-02-02", "Diarreia", 2);
        Paciente p3 = new Paciente("p3", "2003-03-03", "Hemorragia interna", 1);
        Paciente p4 = new Paciente("p4", "2004-04-04", "Dor de barriga", 3);
        Paciente p5 = new Paciente("p5", "2005-05-05", "Incontinência urinária", 2);
        Paciente p6 = new Paciente("p6", "06-06-2006", "Fratura exposta", 1);
        // Ordem esperada: p3 p6 p2 p5 p1 p4

        FilaComPrioridade<Paciente> fila = new FilaComPrioridade<Paciente>();

        System.out.println("\n--- FilaComPrioridade ---");

        fila.enfileirar(p1);
        fila.enfileirar(p2);
        fila.enfileirar(p3);
        fila.enfileirar(p4);
        fila.enfileirar(p5);
        fila.enfileirar(p6);
        
        System.out.println(fila.toString());    // 
        System.out.println("Chamando paciente: " + fila.desenfileira());
        System.out.println(fila.toString());


        Queue<Paciente> queue = new PriorityQueue<Paciente>(
            new Comparator<Paciente>(){
                @Override
                public int compare(Paciente p1, Paciente p2) {
                    return p1.getPrioridade().compareTo(p2.getPrioridade());
                }
            }
        );

        System.out.println("\n--- PriorityQueue ---");

        queue.offer(p1);        
        queue.offer(p2);        
        queue.offer(p3);              
        queue.offer(p4);        
        queue.offer(p5);       
        queue.offer(p6);

        System.out.println(queue.toString());
        System.out.println("Chamando paciente: " + queue.poll());
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}

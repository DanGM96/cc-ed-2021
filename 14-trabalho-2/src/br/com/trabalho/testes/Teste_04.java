package br.com.trabalho.testes;

import java.util.PriorityQueue;

import br.com.trabalho.classes.Paciente;

public class Teste_04 {

    public static void unirFilasPrioritarias(PriorityQueue<Paciente> fila1, PriorityQueue<Paciente> fila2) {
        while(!fila2.isEmpty()){
            Paciente pAtual = fila2.poll();
            if(!fila1.contains(pAtual)){
                fila1.add(pAtual);
            }
        }
    }
    
    public static void main(String[] args) {
        // F1
        Paciente[] pacientes1 = new Paciente[]{
            new Paciente("p01", "2001-01-01", "[1] Coceira", 3),
            new Paciente("p02", "2002-02-02", "[1] Diarreia", 2),
            new Paciente("p03", "2003-03-03", "[1] Hemorragia interna", 1),
            new Paciente("p04", "2004-04-04", "[1] Dor de barriga", 3),
            new Paciente("p05", "2005-05-05", "[1] Incontinência urinária", 2),
            new Paciente("p06", "2006-06-06", "[1] Fratura exposta", 1),
        };
        // F2
        Paciente[] pacientes2 = new Paciente[]{
            new Paciente("p07", "2007-07-07", "[2] Coceira", 3),
            new Paciente("p08", "2008-08-08", "[2] Diarreia", 2),
            new Paciente("p09", "2009-09-09", "[2] Hemorragia interna", 1),
            new Paciente("p10", "2010-10-10", "[2] Dor de barriga", 3),
            new Paciente("p11", "2011-11-11", "[2] Incontinência urinária", 2),
            new Paciente("p12", "2012-12-12", "[2] Fratura exposta", 1),
        };
        
        PriorityQueue<Paciente> F1 = new PriorityQueue<>();
        for (Paciente p : pacientes1) {
            F1.add(p);
        }
        
        PriorityQueue<Paciente> F2 = new PriorityQueue<>();
        for (Paciente p : pacientes2) {
            F2.add(p);
        }
        for (Paciente p : pacientes1) {
            F2.add(p);
        }

        System.out.println("------F1------");
        System.out.println(F1);
        System.out.println("------F2------");
        System.out.println(F2);

        System.out.println("-----UNIR-----");
        unirFilasPrioritarias(F1, F2);

        System.out.println("------F1------");
        System.out.println(F1);
        System.out.println("------F2------");
        System.out.println(F2);

    }
}

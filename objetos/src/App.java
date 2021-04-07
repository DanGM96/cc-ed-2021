public class App {
    public static void main(String[] args) {

        System.out.println("--- Valor ---");
        Valor.testar();

        System.out.println("--- Referência ---");
        Referencia.testar();

        
        System.out.println("--- Miranha ---");
        Miranha mir1 = new Miranha();
        Miranha mir2 = new Miranha();
        Miranha mir3 = new Miranha();

        mir1.setOutro1(mir2);
        mir1.setOutro2(mir3);
        mir2.setOutro1(mir1);
        mir2.setOutro2(mir3);
        mir3.setOutro1(mir1);
        mir3.setOutro2(mir2);

        System.out.println(mir1 + " aponta para " + mir1.getOutro1() + " e para " + mir1.getOutro2());
        System.out.println(mir2 + " aponta para " + mir2.getOutro1() + " e para " + mir2.getOutro2());
        System.out.println(mir3 + " aponta para " + mir3.getOutro1() + " e para " + mir3.getOutro2());
    }
}

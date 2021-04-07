public class Valor {

    public static void testar(){
        int numero = 10;
        String texto = "Olá Mundo!";

        System.out.println("Número inicial: " + numero);
        numeroAoQuadrado(numero); // Tenta modificar
        System.out.println("Número final: " + numero);

        System.out.println();

        System.out.println("Texto inicial: " + texto);
        apagaTexto(texto); // Tenta modificar
        System.out.println("Texto final: " + texto);

        System.out.println();
    }

    public static void numeroAoQuadrado(int num){
        num *= num;
    }

    public static void apagaTexto(String txt) {
        txt = "";
    }

}

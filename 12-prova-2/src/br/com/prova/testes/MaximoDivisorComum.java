package br.com.prova.testes;

public class MaximoDivisorComum {

    public static int mdc(int a, int b) {
        if(b == 0){
            return a;
        }
        return mdc(b, a % b);
    }

    public static void main(String[] args) {

        int[] exemplos = {
            12, 6,
            12, 20,
            27, 81,
        };

        for (int i = 0; i < exemplos.length; i += 2) {
            System.out.print("mdc(" + exemplos[i] + ", " + exemplos[i + 1] + ") = ");
            System.out.println(mdc(exemplos[i], exemplos[i + 1]));
        }
    }
}

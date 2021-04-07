import java.util.Arrays;

public class Referencia {

    public static void testar(){
        
        int[] primos = new int[]{2, 3, 5, 7, 11};
        Pessoa pessoaUm = new Pessoa("Jordan");

        System.out.println("Vetor inicial: " + Arrays.toString(primos));
        vetorAoQuadrado(primos); // Modifica
        System.out.println("Vetor final: " + Arrays.toString(primos));

        System.out.println();

        System.out.println("Pessoa inicial: " + pessoaUm.getNome());
        mudaNome(pessoaUm); // Modifica
        System.out.println("Pessoa final: " + pessoaUm.getNome());

        System.out.println();

        referenciaObjeto();

    }

    public static void vetorAoQuadrado(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] *= vetor[i];
        }
    }

    public static void mudaNome(Pessoa pessoa){
        pessoa.setNome("Dan");
    }

    public static void referenciaObjeto() {
        Pessoa pessoaUm = new Pessoa("Pikachu");
        Pessoa pessoaDois = new Pessoa("Charmander");

        System.out.println("Nome da pessoa um: " + pessoaUm.getNome());
        System.out.println("Nome da pessoa dois: " + pessoaDois.getNome());
        
        System.out.println();
    }
}

import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        
        Pilha<String> pilha = new Pilha<String>();
        Stack<String> stack = new Stack<String>();

        //System.out.println(pilha.topo());
        //System.out.println(pilha.desempilha());

        System.out.println("Pilha");
       pilha.empilha("A");
        pilha.empilha("B");
        pilha.empilha("C");
        pilha.empilha("D");
        pilha.empilha("F");
        pilha.empilha("E");
        System.out.println(pilha.topo());
        System.out.println(pilha.toString());
        System.out.println(pilha.tamanho());

        System.out.println("valor desempilha: "+pilha.desempilha());
        System.out.println("valor desempilha: "+pilha.desempilha());
        System.out.println(pilha.topo());
        System.out.println(pilha.toString());
        System.out.println(pilha.tamanho());

        System.out.println("Stack - API Java");
        stack.push("G");
        stack.push("H");
        stack.push("I");
        stack.push("J");
        System.out.println(stack.peek());
        System.out.println(stack.toString());
        System.out.println(stack.size());
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.toString());
        System.out.println(stack.size());
    }
}

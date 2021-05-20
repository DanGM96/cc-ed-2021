import java.util.ArrayList;

public class ListaPilha<T> extends ArrayList<T> {

    // metodo push da pilha
    public boolean adicionar(T elemento){
        this.add(0, elemento);
        return true;
    }

    // metodo pop da pilha
    public T remover(){
        return this.remove(0);
    }
}

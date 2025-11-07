package integrado;
import java.util.LinkedList;

public class Tres {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        lista.addFirst(10);
        lista.addLast(20);
        lista.push(30);
        lista.pop();
        System.out.println(lista);
    }
}

package integrado;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Dois {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Pessoa 1");
        fila.add("Pessoa 2");
        fila.add("Pessoa 3");
        Stack<String> pilha = new Stack<>();
        pilha.push("Mala A");
        pilha.push("Mala B");
        pilha.push("Mala C");
        fila.poll();
        fila.poll();
        pilha.pop();
        pilha.pop();
        System.out.println("Fila: " + fila);
        System.out.println("Pilha: " + pilha);
    }
}

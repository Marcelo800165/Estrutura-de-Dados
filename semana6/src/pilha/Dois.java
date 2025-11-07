package pilha;
import java.util.Stack;

public class Dois {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        pilha.push(2);
        pilha.push(4);
        pilha.push(6);
        pilha.push(8);
        pilha.push(10);
        pilha.pop();
        pilha.pop();
        pilha.pop();
        System.out.println("Topo: " + pilha.peek());
        System.out.println("Tamanho: " + pilha.size());
    }
}

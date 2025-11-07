package integrado;
import java.util.Stack;

public class Um {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        pilha.push("Digitar A");
        pilha.push("Digitar B");
        pilha.push("Digitar C");
        pilha.pop();
        System.out.println(pilha);
    }
}

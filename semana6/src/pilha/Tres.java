package pilha;
import java.util.Stack;

public class Tres {
    public static void main(String[] args) {
        int[] numeros = {7, 14, 21, 28};
        Stack<Integer> pilha = new Stack<>();
        for (int n : numeros) pilha.push(n);
        while (!pilha.isEmpty()) System.out.println(pilha.pop());
    }
}

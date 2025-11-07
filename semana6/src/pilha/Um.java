package pilha;
import java.util.Stack;

public class Um {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        pilha.push("Home");
        pilha.push("Produtos");
        pilha.push("Carrinho");
        pilha.push("Pagamento");
        System.out.println("Página atual: " + pilha.peek());
        pilha.pop();
        pilha.pop();
        System.out.println("Pilha final: " + pilha);
    }
}

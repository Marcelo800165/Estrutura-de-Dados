package fila;
import java.util.Queue;
import java.util.LinkedList;

public class Dois {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		fila.add("Pedido 1");
		fila.add("Pedido 2");
		fila.add("Pedido 3");
		fila.add("Pedido 4");
		
		System.out.println("Próximo: " + fila.poll());
		System.out.println("Próximo: " + fila.poll());
		System.out.println(fila.size());
		if (fila.size() != 0) {
			System.out.println("Tem pedido");
		} else {
			System.out.println("Não tem pedido");
		}
	}

}

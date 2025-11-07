package fila;
import java.util.Queue;
import java.util.LinkedList;

public class Um {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		fila.add("Yago");
		fila.add("Pedro Augusto");
		fila.add("João");
		fila.add("Marcelo");
		System.out.println("Próximo: " + fila.peek());
		System.out.println("Atendendo: " + fila.poll());
		System.out.println("Atendendo: " + fila.poll());
		System.out.println(fila);
		
	}

}

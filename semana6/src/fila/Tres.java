package fila;

import java.util.LinkedList;
import java.util.Queue;

public class Tres {

	public static void main(String[] args) {
		Queue<String> lista = new LinkedList<>();
		
		lista.add("Lucas");
		lista.add("Bruna");
		lista.add("José");
		lista.add("Ana");
		lista.add("Maria");
		
		lista.poll();
		lista.poll();
		lista.poll();
		
		lista.peek();
		
		System.out.println(lista);
		
	}

}

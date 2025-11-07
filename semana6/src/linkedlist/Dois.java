package linkedlist;
import java.util.LinkedList;

public class Dois {
	public static void main(String [] args) {
		LinkedList<Integer> numeros = new LinkedList<>();
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		numeros.add(40);
		numeros.add(50);
		numeros.add(0,5);
		numeros.add(60);
		numeros.add(3,25);
		System.out.println(numeros);
	}
}

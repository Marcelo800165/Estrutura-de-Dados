package linkedlist;
import java.util.LinkedList;

public class Tres {

	public static void main(String[] args) {
		LinkedList<String> palavras = new LinkedList<>();
		palavras.add("Java");
		palavras.add("Python");
		palavras.add("C++");
		palavras.add("Java");
		palavras.add("Go");
		palavras.remove(String.valueOf("Java"));
		palavras.remove("C++");
		System.out.println(palavras);
	}

}

package linkedlist;
import java.util.LinkedList;

public class Um {
	public static void main(String [] args) {
		LinkedList<String> nomes = new LinkedList<>();
		nomes.add("Yago");
		nomes.add("Marcelo");
		nomes.add("Pedro Augusto");
		nomes.add("Wallace");
		nomes.add("Felippe");
		nomes.remove(0);
		System.out.println(nomes.get(3));
		for(String nome : nomes) {
			System.out.println(nome);
		}
	}
	
	
}

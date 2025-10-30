package semana5;
import java.util.Iterator;
import java.util.LinkedList;
public class questao1 {

	public static void main(String[] args) {
		LinkedList<Integer> numeros = new LinkedList<>();
		for(int i = 0; i <= 10; i++) {
			numeros.add(i);
		}
		System.out.println("Lista original: " + numeros);
		Iterator<Integer> it = numeros.iterator();
		while (it.hasNext()) {
			int valor = it.next();
			if (valor % 2 == 0) {
				it.remove();			}
		}
		System.out.println(numeros);
	}

}

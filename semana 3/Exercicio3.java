import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] nomes = new String[10];
		Boolean bol = false;
		for(int i = 0; i < nomes.length;i++) {
			System.out.println("Digite um nome: ");
			nomes[i] = sc.next();
		}
		System.out.println("Digite um nome deseja remover do array: ");
		String nomeRemovido = sc.next();
		for(int i = 0; i < nomes.length; i++) {
			if(nomeRemovido.equals(nomes[i])) {
				bol = true;
				nomes[i] = "--";
			}
		}
		if(bol) {
			for(int i = 0; i < nomes.length;i++) {
				System.out.println(nomes[i]);
			}
		}
		else {
			System.out.println("O nome não está no array.");
        }
        sc.close();
	}
}
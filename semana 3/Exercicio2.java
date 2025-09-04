import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Boolean seTEM = false;
		int[] numeros = new int[10];
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um número: ");
			numeros[i] = sc.nextInt();
		}
		System.out.println("Digite um número para ver se tem no array: ");
		int numeroEspecial = sc.nextInt();
		int indice = 0;
		int qtd = 0;
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] == numeroEspecial) {
				seTEM = true;
				qtd++;
				indice = i;
			}
		}
		if(seTEM) {
			System.out.println("índice: "+indice);
		}
		System.out.println("Quantidade de vezes que o número digitado aparece: "+qtd);
        sc.close();
	}
}
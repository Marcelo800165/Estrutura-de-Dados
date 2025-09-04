import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int[] numeros = new int[20];
        int pares = 0;
        int impares = 0;
        for(int i = 0; i < 20; i ++){
            System.out.println("Digite um número: ");
            numeros[i] = sc.nextInt();
            if(numeros[i] % 2 == 0){
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Existem " + pares + " números pares.");
        System.out.println("Existem " + impares + " números ímpares.");
        sc.close();
    }
}
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Preencha o array [" + i + "]: ");
            numeros[i] = sc.nextInt();
        }
        int n = numeros.length;
        boolean alterou;

        do {
            alterou = false; 
            for (int i = 0; i < n - 1; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = temp;
                    alterou = true;
                }
            }
            n--;
        } while (alterou);
        System.out.println("Array ordenado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}

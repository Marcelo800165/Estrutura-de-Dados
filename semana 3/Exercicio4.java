import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("Digite 10 números inteiros:");
        int i = 0;
        while (i < numeros.length) {
            numeros[i] = sc.nextInt();
            i++;
        }
        i = 0;
        while (i < numeros.length) {
            int num = numeros[i];
            int cont = 0;
            boolean jaContado = false;
            int j = 0;
            while (j < i) {
                if (numeros[j] == num) {
                    jaContado = true;
                    break;
                }
                j++;
            }
            if (!jaContado) {
                j = 0;
                while (j < numeros.length) {
                    if (numeros[j] == num) {
                        cont++;
                    }
                    j++;
                }
                System.out.println(num + " aparece " + cont + " vez(es).");
            }
            i++;
        }
        sc.close();
    }
}

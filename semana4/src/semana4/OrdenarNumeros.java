package semana4;
import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Criação de um array para armazenar 10 números inteiros
        int[] numeros = new int[10];

        // Solicitação para o usuário digitar 10 números inteiros
        System.out.println("Digite 10 números inteiros:");
        
        // Laço de repetição para capturar os 10 números digitados pelo usuário
        for (int i = 0; i < numeros.length; i++) {
            // Leitura de um número inteiro e atribuição à posição correspondente do array
            numeros[i] = scanner.nextInt();
        }

        // Ordenação dos números em ordem crescente utilizando o algoritmo Bubble Sort
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                // Comparação entre dois números consecutivos
                if (numeros[j] > numeros[j + 1]) {
                    // Troca dos elementos caso o número atual seja maior que o próximo
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        // Exibição dos números ordenados em ordem crescente
        System.out.println("Números em ordem crescente:");
        for (int numero : numeros) {
            // Imprime cada número no array com um espaço entre eles
            System.out.print(numero + " ");
        }

        scanner.close();
    }
}

package semana4;

import java.util.Scanner;

public class OrdenaProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Arrays para armazenar os nomes e preços dos 10 produtos
        String[] nomes = new String[10];
        double[] precos = new double[10];

        // Solicitação para o usuário digitar os nomes e preços dos produtos
        System.out.println("Digite o nome e preço de 10 produtos:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nome do produto " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
            
            System.out.print("Preço do produto " + (i + 1) + ": ");
            precos[i] = scanner.nextDouble();
            
            scanner.nextLine();
        }

        // Ordenação dos produtos com o algoritmo Bubble Sort baseado nos preços em ordem decrescente
        for (int i = 0; i < precos.length - 1; i++) {
            for (int j = 0; j < precos.length - i - 1; j++) {
                // Comparação dos preços dos produtos
                if (precos[j] < precos[j + 1]) {
                    // Troca dos preços de posição caso o preço do produto j seja menor que o de j+1
                    double tempPreco = precos[j];
                    precos[j] = precos[j + 1];
                    precos[j + 1] = tempPreco;

                    // Troca dos nomes para garantir que a associação produto-preço se mantenha correta
                    String tempNome = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = tempNome;
                }
            }
        }

        // Exibição dos produtos ordenados do mais caro para o mais barato
        System.out.println("\nProdutos ordenados do mais caro para o mais barato:");
        for (int i = 0; i < 10; i++) {
            // Exibe o nome do produto e seu preço formatado com 2 casas decimais
            System.out.println(nomes[i] + " - R$ " + String.format("%.2f", precos[i]));
        }
        scanner.close();
    }
}

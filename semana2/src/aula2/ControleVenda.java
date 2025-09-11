package aula2;

import java.util.Scanner;

public class ControleVenda {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o número da venda: ");
            int numero = sc.nextInt();

            System.out.print("Digite a quantidade de produtos: ");
            int quantidade = sc.nextInt();

            System.out.print("Digite o valor unitário do produto: ");
            double valorUnitario = sc.nextDouble();

            VendaProduto venda = new VendaProduto(numero, quantidade, valorUnitario);

            System.out.println("\n---------- DADOS DA VENDA ----------");
            System.out.printf("Número da venda: %d\n", venda.getNumero());
            System.out.printf("Quantidade de produtos: %d\n", venda.getQuantidade());
            System.out.printf("Valor unitário: R$ %.2f\n", venda.getValorUnitario());
            System.out.printf("Valor total a pagar: R$ %.2f\n", venda.calcularValorTotal());
            System.out.println("------------------------------------");

        } catch (Exception e) {
            System.err.println("Ocorreu um erro ao ler os dados. Certifique-se de digitar os números corretamente.");
            System.err.println("Detalhe do erro: " + e.getMessage());
        }
    }
}
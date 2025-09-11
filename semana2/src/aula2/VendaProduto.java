package aula2;

public class VendaProduto {
    private int numero;
    private int quantidade;
    private double valorUnitario;

    public VendaProduto(int numero, int quantidade, double valorUnitario) {
        if (quantidade < 0 || valorUnitario < 0) {
            throw new IllegalArgumentException("Quantidade e valor unitário não podem ser negativos.");
        }
        this.numero = numero;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double calcularValorTotal() {
        return quantidade * valorUnitario;
    }
}
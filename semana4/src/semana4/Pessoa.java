package semana4;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    // Construtor que inicializa os atributos
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Getters para acessar os valores dos atributos
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    // Método toString para exibir as informações de forma legível
    @Override
    public String toString() {
        return String.format("Nome: %s | Idade: %d | Altura: %.2f m", nome, idade, altura);
    }
}

import semana4.ControlePessoas;

public class Principal {
    public static void main(String[] args) {
        // Cria uma instância do ControlePessoas
        ControlePessoas controle = new ControlePessoas();
        
        // Chama o método para cadastrar as pessoas
        controle.cadastrarPessoas();
        
        // Exibe o menu para o usuário escolher o critério de ordenação
        controle.exibirMenu();
    }
}

import java.util.HashMap;

// Classe Pessoa
class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }

    public Pessoa clone() {
        return new Pessoa(nome, idade);
    }
}

// Classe PessoaManager (DEUS)
class PessoaManager {
    private HashMap<Integer, Pessoa> pessoas;

    public PessoaManager() {
        pessoas = new HashMap<>();
    }

    public void addPessoa(String nome, int idade, int id) {
        Pessoa pessoa = new Pessoa(nome, idade);
        pessoas.put(id, pessoa);
    }

    public Pessoa getPessoa(int id) {
        return pessoas.get(id).clone();
    }
}

public class Main {
    public static void main(String[] args) {
        // UTILIZAR A ESTRUTURA ###########################################################
        PessoaManager manager = new PessoaManager();

        // Adicionar Pessoas
        manager.addPessoa("João", 30, 1);
        manager.addPessoa("Maria", 25, 2);
        manager.addPessoa("Pedro", 20, 3);
        manager.addPessoa("Carlos", 30, 4);
        manager.addPessoa("Emilia", 50, 5);

        // Clonar Pessoas
        Pessoa pessoa1 = manager.getPessoa(1);
        Pessoa pessoa2 = manager.getPessoa(5);

        // Modificar Informações
        pessoa1 = new Pessoa(pessoa1.toString().split(", ")[0], 18);
        pessoa2 = new Pessoa("Alvaro Jose", 55);

        // Imprimir Resultados
        System.out.println(manager.getPessoa(1));
        System.out.println(manager.getPessoa(2));
        System.out.println(manager.getPessoa(3));
        System.out.println(manager.getPessoa(4));
        System.out.println(manager.getPessoa(5));
        System.out.println("--------------------------------------------------------");
        System.out.println(pessoa1);
        System.out.println(pessoa2);
    }
}

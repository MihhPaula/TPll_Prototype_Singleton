import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private static Carrinho instance;
    private List<Produto> produtos;

    private Carrinho() {
        produtos = new ArrayList<>();
    }

    public static Carrinho getInstance() {
        if (instance == null) {
            instance = new Carrinho();
        }
        return instance;
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void clearCarrinho() {
        produtos.clear();
    }

    public static void main(String[] args) {
        // EXEMPLO DE USO ##############################################################
        Carrinho carrinhoInstance1 = Carrinho.getInstance();
        Carrinho carrinhoInstance2 = Carrinho.getInstance();

        System.out.println(carrinhoInstance1 == carrinhoInstance2);

        carrinhoInstance1.addProduto(new Produto(1, "Produto 1", 10.00));
        carrinhoInstance2.addProduto(new Produto(2, "Produto 2", 20.00));

        System.out.println(carrinhoInstance1.getProdutos());
        System.out.println(carrinhoInstance2.getProdutos());

        carrinhoInstance1.clearCarrinho();

        System.out.println(carrinhoInstance1.getProdutos());
        System.out.println(carrinhoInstance2.getProdutos());
    }
}

class Produto {
    private int id;
    private String nome;
    private double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Preço: " + preco;
    }
}

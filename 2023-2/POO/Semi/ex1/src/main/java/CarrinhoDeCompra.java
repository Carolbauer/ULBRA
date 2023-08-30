import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    private final List<Produto> produtos;
    private double valorTotal;

    public CarrinhoDeCompra() {
        produtos = new ArrayList<>();
        valorTotal = 0.0;
    }

    public void adicionarAoCarrinho(Produto produto) {
        produtos.add(produto);
        this.valorTotal += produto.getValor();
    }

    public double getTotal() {
        return this.valorTotal;

    }
}



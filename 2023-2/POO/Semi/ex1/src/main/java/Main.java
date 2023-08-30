public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("iPhone", 10000.0, "14 PRO MAX");
            final Produto produto2 = new Produto("AirPods", 1000.0, "apple");

        final CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
        carrinhoDeCompra.adicionarAoCarrinho(produto2);
        carrinhoDeCompra.adicionarAoCarrinho(produto1);

        System.out.println("Valor total: " + carrinhoDeCompra.getTotal());

    }
}

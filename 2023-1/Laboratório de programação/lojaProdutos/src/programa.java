public class programa {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Caderno 48 folhas", 48.00, 15);
        Produto produto2 = new Produto("Caneta Azul", 5.00, 30);
        Produto produto3 = new Produto("Mochila", 120.00, 3);

        Loja loja = new Loja();

        //Add produtos
        loja.adicionarProduto(produto1);
        loja.adicionarProduto(produto2);
        loja.adicionarProduto(produto3);

        //listar produtos
        loja.listarProduto(produto1);
        loja.listarProduto(produto2);
        loja.listarProduto(produto3);

        //vender produto
        loja.venderProduto(produto1,5);
        loja.venderProduto(produto2, 10);
        loja.venderProduto(produto3, 1);

        loja.removerProduto(produto1);

        //produtos disponíveis após venda
        loja.listarProduto(produto1);
        loja.listarProduto(produto2);
        loja.listarProduto(produto3);

        // add estoque
        loja.adicionarEstoque(produto1, 4);
        loja.adicionarEstoque(produto2, 100);
        loja.adicionarEstoque(produto3, 3);

        //produtos disponíveis após adicionar estoque
        loja.listarProduto(produto1);
        loja.listarProduto(produto2);
        loja.listarProduto(produto3);


    }
}

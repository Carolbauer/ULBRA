public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.codigo = "a2";
        produto1.preco = 1.99;
        System.out.println("Código do Produto 1:" + produto1.codigo + " " + "Preço do produto:R$" + produto1.preco);

        ProdutoPerecivel produtoPerecivel1 = new ProdutoPerecivel();
        produtoPerecivel1.codigo = "p12";
        produtoPerecivel1.preco = 10.99;
        produtoPerecivel1.dataValidade = "2023-06-15";
        System.out.println("Código do Produto 1:" + produtoPerecivel1.codigo + " " + "Preço do produto:R$" + produtoPerecivel1.preco + " "+ "Data de validade:" +produtoPerecivel1.dataValidade);
    }
}

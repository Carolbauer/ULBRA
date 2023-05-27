public class Eletronicos extends Produto{
    String categoria;
    String marca;
    int quantidadeProdutos;
    double precoTotal;

    public Eletronicos(String nome, double preco, String categoria, String marca, int quantidadeProdutos){
        super(nome, preco);
        this.marca = marca;
        this.categoria = categoria;
        this.quantidadeProdutos = quantidadeProdutos;

    }

    @Override
    public double calcularPreco() {
        if (quantidadeProdutos > 0) {
            precoTotal = preco * quantidadeProdutos;
            System.out.println("Valor total de Produtos");
        } else {
            System.out.println("Não foi comprado nenhum Produto");
        }
        return preco;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Valor R$: " + preco);
        System.out.println("Marca: " + marca);
        System.out.println("Quantidade de Produtos: " + quantidadeProdutos);
        System.out.println("Categoria:" + categoria);
        System.out.println("Valor total de Livros: R$" + precoTotal);
    }
}

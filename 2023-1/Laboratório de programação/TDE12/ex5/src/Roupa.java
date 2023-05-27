public class Roupa extends Produto {
    String tamanho;
    Boolean estoque;
    String categoria;
    int quantidadeProdutos;
    double precoTotal;

    public Roupa(String nome, double preco, String tamanho, boolean estoque, String categoria, int quantidadeProdutos){
        super(nome, preco);
        this.tamanho = tamanho;
        this.estoque = estoque;
        this.categoria = categoria;
        this.quantidadeProdutos = quantidadeProdutos;

    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Valor R$: " + preco);
        System.out.println("Tamanho" + tamanho);
        System.out.println("Tem estoque: " + estoque);
        System.out.println("Categoria: " + categoria);
        System.out.println("Quantidade de Produtos: " + quantidadeProdutos);
        System.out.println("Valor total de Livros R$ " + precoTotal);

    }

    @Override
    public double calcularPreco() {
        if (quantidadeProdutos > 0) {
            precoTotal = preco * quantidadeProdutos;
            System.out.println("Valor total de roupas");
        } else {
            System.out.println("Não foi comprado nenhuma roupa");
        }
        return preco;
    }

}

public class Livro extends Produto{
    int numeroPaginas;
    String autor;
    int quantidadeProdutos;
    double precoTotal;

    public Livro(String nome, double preco, int numeroPaginas, String autor, int quantidadeProdutos ){
        super(nome,preco);
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
        this.quantidadeProdutos = quantidadeProdutos;

    }

    @Override
    public double calcularPreco() {
        if (quantidadeProdutos > 0) {
            precoTotal = preco * quantidadeProdutos;

        } else {
            System.out.println("Não foi comprado nenhum livro");
        }
        return preco;
    }




    @Override
    public void exibirDetalhes() {
        System.out.println("Nome do Livro: " + nome);
        System.out.println("Valor do Livro R$: " + preco);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("Autor: " + autor);
        System.out.println("Quantidade de Produtos: " + quantidadeProdutos);
        System.out.println("Valor total de Livros R$ " + precoTotal);
    }
}

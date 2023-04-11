public class Loja {
    private Produto produto1;
    private Produto produto2;
    private Produto produto3;

    public void adicionarProduto(Produto produto) {
        if (this.produto1 == null) {
            this.produto1 = produto;
        } else if (this.produto2 == null) {
            this.produto2 = produto;
        } else if (this.produto3 == null) {
            this.produto3 = produto;
        } else {
            System.out.println("A loja já atingiu o número máximo de produtos");
        }

    }

    public void removerProduto(Produto produto) {
        if (this.produto1 == produto) {
            this.produto1 = null;
        } else if (this.produto2 == produto) {
            this.produto2 = null;
        } else if (this.produto3 == produto) {
            this.produto3 = null;
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void listarProduto(Produto produto) {
        if (this.produto1 == produto) {
            System.out.println(this.produto1.getNome() + " - R$ " + " " + this.produto1.getPreco() + " - "
                    + this.produto1.getQuantidade() + " " + "em estoque");
        }
        if (this.produto2 == produto) {
            System.out.println(this.produto2.getNome() + "- R$" + " " + this.produto2.getPreco() + "-"
                    + this.produto2.getQuantidade() + " " + "em estoque");
        }
        if (this.produto3 == produto) {
            System.out.println(this.produto3.getNome() + " - R$" + " " + this.produto3.getPreco() + "-"
                    + this.produto3.getQuantidade() + " " + "em estoque");
        }

    }

    public void venderProduto(Produto produto, int quantidade) {
        if (this.produto1 == produto) {
            if (this.produto1.getQuantidade() >= quantidade) {
                this.produto1.setQuantidade(this.produto1.getQuantidade() - quantidade);
                System.out.println("Venda realizada com sucesso!");
            } else {
                System.out.println("Não há quantidade suficiente em estoque para realizar a venda");
            }
        } else if (produto2 != null && produto2.getNome().equals(produto.getNome())) {
            if (produto2.getQuantidade() >= quantidade) {
                produto2.setQuantidade(produto2.getQuantidade() - quantidade);
                System.out.println("Venda realizada com sucesso!");
            } else {
                System.out.println("Não há quantidade suficiente em estoque para realizar a venda");
            }
        } else if (produto3 != null && produto3.getNome().equals(produto.getNome())) {
            if (produto3.getQuantidade() >= quantidade) {
                produto3.setQuantidade(produto3.getQuantidade() - quantidade);
                System.out.println("Venda realizada com sucesso!");
            } else {
                System.out.println("Não há quantidade suficiente em estoque para realizar a venda");
            }
        }
    }

    public void adicionarEstoque(Produto produto, int quantidade) {
        // Verifica se o produto passado por parâmetro está disponível na loja
        if (produto == null) {
            System.out.println("Produto naão encontradp");
        } else {
            produto.setQuantidade(produto.getQuantidade() + quantidade);
            System.out.println("Produto adicionado ao estoque");
        }


    }
}
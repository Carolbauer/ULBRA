public class Loja {
    private Produto produto1;
    private Produto produto2;
    private Produto produto3;

    public void adicionarProduto(Produto produto) {
        if (produto1 == null) {
            produto1 = produto;
        } else if (produto2 == null) {
            produto2 = produto;
        } else if (produto3 == null) {
            produto3 = produto;
        } else {
            System.out.println("A loja já atingiu o número máximo de produtos");
        }

    }

    public void removerProduto(Produto produto) {
        if (produto1 == produto) {
            produto1 = null;
        } else if (produto2 == produto) {
            produto2 = null;
        } else if (produto3 == produto) {
            produto3 = null;
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void listarProduto(Produto produto) {
        if (produto1 != null) {
            System.out.println(produto1.getNome() + " - R$ " + produto1.getPreco() + " - "
                    + produto1.getQuantidade() + "em estoque");
        }
        if (produto2 != null) {
            System.out.println(produto2.getNome() + "- R$" + produto2.getPreco() + "-"
                    + produto2.getQuantidade() + "em estoque");
        }
        if (produto3 != null) {
            System.out.println(produto3.getNome() + " - R$" + produto3.getPreco() + "-"
                    + produto3.getQuantidade() + "em estoque");
        }

    }

    public void venderProduto(Produto produto, int quantidade) {
        if (produto1 != null && produto1.getNome().equals(produto.getNome())) {
            if (produto1.getQuantidade() >= quantidade) {
                produto1.setQuantidade(produto1.getQuantidade() - quantidade);
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

    public void adicionarEstoque(Produto produto, int quantidade){
        Produto produtoAdd = null;
        // Verifica se o produto passado por parâmetro está disponível na loja
        if (produto1 != null && produto1.equals(produto)) {
            produtoAdd = produto1;
        } else if (produto2 != null && produto2.equals(produto)) {
            produtoAdd = produto2;
        } else if (produto3 != null && produto3.equals(produto)) {
            produtoAdd = produto3;
        }

        if (produtoAdd == null) {
            System.out.println("Produto inexistente");
            return;
        }

        produtoAdd.adicionarEstoque(quantidade);{
            System.out.println("Estoque atualizado com sucessp!");

        }
    }


}
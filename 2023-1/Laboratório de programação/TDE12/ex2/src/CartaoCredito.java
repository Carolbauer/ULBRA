public class CartaoCredito extends Pagamento {
    String numerocartao;
    String dataValidade;
    String nome;

    public CartaoCredito(String numerocartao, String dataValidade, String nome){
        this.numerocartao = numerocartao;
        this.dataValidade = dataValidade;
        this.nome = nome;
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento com cartão de crédito");
    }

    @Override
    public void emitirRecibo() {
        System.out.println("Imprimindo recibo...");

    }
}

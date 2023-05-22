public  class CartaoDebito extends Pagamento{
    String numero;
    String nome;
    String dataValidade;

    public CartaoDebito(String numero, String nome, String dataValidade){
        this.numero = numero;
        this.nome = nome;
        this.dataValidade = dataValidade;
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento com cartão de débito");
    }

    @Override
    public void emitirRecibo() {
        System.out.println("Emitindo Recbido de pagamento ...");
    }
}

public  class Dinheiro extends Pagamento {
    double valor;

    public Dinheiro(double valor){
        this.valor = valor;
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento em dinheiro");
    }

    @Override
    public void emitirRecibo() {
        System.out.println("Imprimindo recibo de pagamento...");
    }
}

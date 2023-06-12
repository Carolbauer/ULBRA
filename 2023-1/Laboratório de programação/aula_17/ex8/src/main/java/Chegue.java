public class Chegue implements Pagável {
    @Override
    public void pagar() {
        System.out.println("Pagando em Cheque...");
    }

    @Override
    public void verificarPagamento() {
        System.out.println("Verificando pagamento de cheque...");
    }
}

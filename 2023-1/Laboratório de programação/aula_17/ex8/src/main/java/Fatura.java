public class Fatura implements Pagável{
    @Override
    public void pagar() {
        System.out.println("Pagando Fatura...");
    }

    @Override
    public void verificarPagamento() {
        System.out.println("Verificando pagamento de fatura...");
    }
}

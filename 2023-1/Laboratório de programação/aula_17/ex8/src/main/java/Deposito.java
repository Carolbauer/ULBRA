public class Deposito implements Pagável{
    @Override
    public void pagar() {
        System.out.println("Pagando com depósito...");
    }

    @Override
    public void verificarPagamento() {
        System.out.println("Verificando pagamento por depósito...");
    }
}

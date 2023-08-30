public class ContaCorrente extends Conta{

    public ContaCorrente(int numero, double saldo) {
        super(numero, saldo);
    }
    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        super.transferir(valor, contaDestino);
    }
}

public class ContaPoupanca extends Conta{
    public ContaPoupanca(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void depositar(final double valor) {
        super.depositar(valor);
    }

}

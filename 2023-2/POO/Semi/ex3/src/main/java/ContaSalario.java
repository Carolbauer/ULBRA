public class ContaSalario extends Conta{
    public ContaSalario(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void sacar(final double valor) {
        super.sacar(valor);
    }
}

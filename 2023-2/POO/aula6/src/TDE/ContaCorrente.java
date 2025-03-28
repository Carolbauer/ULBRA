package TDE;

public class ContaCorrente extends Conta{
private double saldo;
    public ContaCorrente(final Cliente cliente, final int numerodaConta) {
        super(cliente, numerodaConta);
        setCliente(cliente);
        setNumerodaConta(numerodaConta);
    }
    @Override
    public void depositar(final double valor) {
        this.saldo +=valor;

    }

    @Override
    public void transferir(Conta destino, double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }
}

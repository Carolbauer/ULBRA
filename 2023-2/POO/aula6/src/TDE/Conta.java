package TDE;

public abstract class Conta {

    private Cliente cliente;
    private int numerodaConta;
    private double saldo;
    public abstract void depositar();
    public abstract void transferir();
    public abstract double consultarSaldo();

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(final Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumerodaConta() {
        return numerodaConta;
    }

    public void setNumerodaConta(int numerodaConta) {
        this.numerodaConta = numerodaConta;
    }
}

package TDE;

public abstract class Conta {

    private Cliente cliente;
    private final int numerodaConta;
    private double saldo;

    protected Conta(Cliente cliente, int numerodaConta){
        this.cliente = cliente;
        this.numerodaConta = numerodaConta;
    }
    public abstract void depositar(double valor);
    public abstract void transferir(Conta destino, double valor);
    public abstract double consultarSaldo();

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumerodaConta() {
        return this.numerodaConta;
    }

    public void setNumerodaConta(int numerodaConta) {
        numerodaConta = this.numerodaConta;
    }


}

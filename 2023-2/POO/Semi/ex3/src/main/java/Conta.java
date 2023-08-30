abstract class Conta {
    private int numero;
    private double saldo;

    protected Conta(final int numero, final double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            this.saldo -= valor;
        }
    }

    public void transferir (final double valor, Conta contaDestino) {
        if (saldo >= valor) {
            saldo -= valor;
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferência!");
        }
    }
}

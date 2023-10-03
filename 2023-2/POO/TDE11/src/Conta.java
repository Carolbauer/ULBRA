public class Conta{
    //atributo estático usado para atibuir atutomaticamente o número da conta
    private static int numeroContas = 1;
    //Atributos
    private final int numeroConta;
    private double saldo;
    private final String nomeCliente;

    //Construtor
    public Conta(int numeroConta, double saldo, String nomeCliente){
        this.numeroConta = numeroContas;
        Conta.numeroContas++;
        this.saldo = saldo;
        this.nomeCliente = nomeCliente;
    }


    //getters e setters utilizados para acessar e modificar os atributos das contas
    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        numeroConta = numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(final double saldo) {
        this.saldo = saldo;
    }

    // Método para imprimir informações da conta
    @Override
    public String toString() {
        return "Número da Conta: " + this.numeroConta + ", Saldo: " + this.saldo + " Cliente: " + this.nomeCliente;
    }

}

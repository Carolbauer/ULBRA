/*Crie uma classe chamada "ContaBancaria" que representará uma conta bancária. Esta classe deve ter:
Três atributos privados: "numeroConta" (String), "saldo" (double) e "titular" (Pessoa).
Métodos públicos para depositar (depositar), sacar (sacar) e consultar o saldo (getSaldo).*/
public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private String titular;

    public ContaBancaria(String numeroConta, double saldo, String titular){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;

    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}

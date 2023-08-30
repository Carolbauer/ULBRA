public class Main {
    public static void main(String[] args) {
        final ContaCorrente contaCorrente = new ContaCorrente(123456, 1000.0);
        final ContaPoupanca contaPoupanca = new ContaPoupanca(789012, 500.0);
        final ContaSalario contaSalario = new ContaSalario(345678, 200.0);

        contaCorrente.depositar(1000.0);
        contaPoupanca.depositar(500.0);
        contaSalario.depositar(200.0);

        contaCorrente.sacar(300.0);
        contaCorrente.transferir(100, contaPoupanca);
        contaSalario.sacar(100.0);
        System.out.println("Saldo da conta corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo da conta poupança: " + contaPoupanca.getSaldo());
        System.out.println("Saldo da conta salário: " + contaSalario.getSaldo());
    }
    }


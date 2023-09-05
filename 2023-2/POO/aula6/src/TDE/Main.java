package TDE;

public class Main {
    public static void main(String[] args) {

         Cliente Caroline = new Cliente("Caroline", 34);
         ContaCorrente conta1 = new ContaCorrente(Caroline,789);
        Caroline.setConta(conta1);

        ContaPoupanca conta2 = new ContaPoupanca(Caroline, 123);


        conta1.depositar(1000);
        conta2.depositar(500);

        conta1.transferir(conta2, 300);

        System.out.println(conta1.getCliente().getNome());
        System.out.println(Caroline.getContas().get(0).getNumerodaConta());
        System.out.println(Caroline.getContas());
        System.out.println("Saldo da conta 1: " + conta1.consultarSaldo());
        System.out.println("Saldo da conta 2: " + conta2.consultarSaldo());


    }
}

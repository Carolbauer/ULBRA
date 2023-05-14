public class Main {
    public static void main(String[] args) {


        ContaCorrente conta1 = new ContaCorrente();
        conta1.Saldo = 1000;
        conta1.numero = 33;
        conta1.limite = 5000;

        System.out.println("Saldo da conta:R$" + conta1.Saldo);
        System.out.println("Número da conta:" + conta1.numero);
        System.out.println("Limite da conta: R$" + conta1.limite);
    }
}

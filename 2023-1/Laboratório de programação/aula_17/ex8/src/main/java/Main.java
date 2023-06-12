public class Main {
    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        fatura.pagar();
        fatura.verificarPagamento();

        System.out.println("=================");

        Chegue chegue = new Chegue();
        chegue.pagar();
        chegue.verificarPagamento();

        System.out.println("=================");

        Deposito deposito = new Deposito();
        deposito.pagar();
        deposito.verificarPagamento();
    }
}

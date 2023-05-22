public class Main {
    public static void main(String[] args) {
        CartaoCredito cartaoCredito = new CartaoCredito("1283895-38", "01/02/2028", "Carlos");
        cartaoCredito.realizarPagamento();
        cartaoCredito.emitirRecibo();

        CartaoDebito cartaoDebito = new CartaoDebito("293949-0", "João", "12/12/2023");
        cartaoDebito.realizarPagamento();
        cartaoDebito.emitirRecibo();

        Dinheiro dinheiro = new Dinheiro(100.50);
        dinheiro.realizarPagamento();
        dinheiro.emitirRecibo();
    }
}

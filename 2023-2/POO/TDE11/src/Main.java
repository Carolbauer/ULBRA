public class Main {
    public static void main(String[] args) {
        Banco Nubank = new Banco();
        Nubank.criarConta(1,1000,"Caroline");
        Nubank.criarConta(2,2000,"Pedro");
        Nubank.criarConta(3,3000,"João");
        System.out.println("Contas criadas com sucesso!");

        Nubank.imprimirContas();
        System.out.println("Contas impressas com sucesso!");

        Nubank.atualizarSaldo(1, 500);
        Nubank.atualizarSaldo(2, 1000);
        Nubank.atualizarSaldo(3, 1500);
        System.out.println("Saldo atualizado com sucesso!");

        Nubank.imprimirContas();
        System.out.println("Contas impressas com sucesso!");

        Nubank.deletarConta(3);

        Nubank.imprimirContas();

    }
}

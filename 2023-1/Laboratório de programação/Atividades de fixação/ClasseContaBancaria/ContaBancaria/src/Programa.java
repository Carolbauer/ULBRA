public class Programa {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("2349-01", 2000.00, "João da Silva");
        System.out.println("Número da Conta:" + contaBancaria.getNumeroConta());
        System.out.println("Saldo:" + contaBancaria.getSaldo());
        System.out.println("Nome Titular:" +contaBancaria.getTitular());
    }
}

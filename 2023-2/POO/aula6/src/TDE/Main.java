package TDE;

public class Main {
    public static void main(String[] args) {

        final Cliente Caroline = new Cliente("Carolie", 34);

        final ContaCorrente conta1 = new ContaCorrente(Caroline);

        System.out.println(conta1.getCliente().getNome());
    }
}

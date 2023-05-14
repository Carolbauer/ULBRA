public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Caroline";
        pessoa1.endereco = "Capão da Canoa";
        System.out.println("Nome do cliente: " + pessoa1.nome + " " + "Endereço:" + pessoa1.endereco);

        Cliente cliente1 = new Cliente();
        cliente1.nome = "Geovane";
        cliente1.endereco ="Torres";
        cliente1.numeroCartao = 1223345;
        System.out.println("Nome do cliente: " + cliente1.nome + " " + "Endereço:" + cliente1.endereco + " " + " Número do Cartão:" + cliente1.numeroCartao);
    }
}

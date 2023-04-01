public class programa {
    public static void main(String[] args) {
        pessoa Pessoa  = new pessoa ("Caroline", 34, 1.60);
        System.out.println("Nome:" + Pessoa.getNome());
        System.out.println("Idade:" + Pessoa.getIdade());
        System.out.println("Altura:" + Pessoa.getAltura());

    }
}

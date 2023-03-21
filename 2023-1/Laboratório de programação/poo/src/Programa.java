public class Programa {
    public static void main(String[] args) {
        livro livro1 = new livro();
        livro1.nome = "Harry Potter";
        Date data = new Date();

        livro1.emprestar(10);
        var dataAgora  = livro1.emprestar(data);
        System.out.println(dataAgora);

        /*livro livro2 = new livro();
        livro2.nome = "O pequeno príncipe";
        System.out.println("Nome do livro 1" + livro1.nome);
        System.out.println("Nome do livro 2" + livro2.nome);*/

    }
}

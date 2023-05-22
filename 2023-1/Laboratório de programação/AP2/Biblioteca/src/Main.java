public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Java","fogaça", 2022,true);
        Livro livro2 = new Livro("Phyton", "Paulo", 2021, false);
        Livro livro3 = new Livro("Lógica de programação","Ramon", 2020,true);
        Livro livro4 = new Livro("Banco de Dados", "Cássio", 2022, true);
        Livro livro5 = new Livro("Plataformas computacionais", "Vini", 2021, false);

        //imprimir detalhes livros
        System.out.println(livro1.detalhesDoProduto());
        System.out.println("                                                 ");
        System.out.println(livro2.detalhesDoProduto());
        System.out.println("                                                 ");
        System.out.println(livro3.detalhesDoProduto());
        System.out.println("                                                 ");
        System.out.println(livro4.detalhesDoProduto());
        System.out.println("                                                 ");
        System.out.println(livro5.detalhesDoProduto());

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);

        //verificar disponibilidade de um livro
        System.out.println("Disponibilidade Livro 1:" +" "+ biblioteca.verificarDisponibilidadedeLivro(livro1));
        System.out.println("Disponibilidade Livro 2:" +" "+ biblioteca.verificarDisponibilidadedeLivro(livro2));
        System.out.println("Disponibilidade Livro 3:" +" "+ biblioteca.verificarDisponibilidadedeLivro(livro3));
        System.out.println("Disponibilidade Livro 4:" +" "+ biblioteca.verificarDisponibilidadedeLivro(livro4));
        System.out.println("Disponibilidade Livro 5:" +" "+ biblioteca.verificarDisponibilidadedeLivro(livro5));
        System.out.println("                                                                            ");

        //Atualizar detalhes do livro
        biblioteca.atualizarDetalhesLivro(livro1,"Laboratório de Programação", "Lucas Fogaça", 2023);
        System.out.println("Detalhes livro após atualização:" + " " + livro1.detalhesDoProduto());

        //remover livro
        biblioteca.removerLivro(livro2);
        


    }
}

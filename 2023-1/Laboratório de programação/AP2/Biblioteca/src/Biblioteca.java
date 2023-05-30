import java.lang.reflect.Array;

public class Biblioteca {
    private Livro[] livros = new Livro[100];
    private int [] a = new int[10];


    // Método para adicionar um livro, substituindo um livro existente caso todos os espaços estejam ocupados
public void adicionarLivro(Livro novoLivro){
    for (int i = 0; i < livros.length; i++){
        if (livros[i] == null){
            livros[i] = novoLivro;
        }
    }
}

//Metodo para remover um livro
    public void removerLivro(Livro livro){
    for (int i = 0; i < livros.length; i++){
        if (livros[i] == livro){
            livros[i] = null;
        }
    }
    }
    //Método para atualizar os detalhes de um livro
    public void atualizarDetalhesLivro(Livro livro,String novoTitulo, String novoAutor, int novoAnoPublicacao) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == livro) {
                livros[i].setTitulo(novoTitulo);
                livros[i].setAutor(novoAutor);
                livros[i].setAnoPublicacao(novoAnoPublicacao);
            }
        }
    }

    //Método para ver a disponibilidade de um livro
    public boolean verificarDisponibilidadedeLivro(Livro livro){
       for (int i = 0; i < livros.length; i++){
        if (livros[i] == livro){
            return livros[i].isDisponibilidade();
        }
       }
        return false;
    }

}



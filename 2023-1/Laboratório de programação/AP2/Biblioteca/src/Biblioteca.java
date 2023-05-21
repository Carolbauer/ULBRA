public class Biblioteca {
  Livro livro1;
     Livro livro2;
     Livro livro3;
     Livro livro4;
     Livro livro5;


    // Método para adicionar um livro, substituindo um livro existente caso todos os espaços estejam ocupados
public void adicionarLivro(Livro livro){
    if (livro1 == null){
        livro1 = livro;
    } else if (livro2 == null) {
        livro2 = livro;
    } else if (livro3 ==null) {
        livro3 = livro;
    } else if (livro4 == null) {
        livro4 = livro;
    } else if (livro5 == null) {
        livro5 = livro;
    }else{
        livro1 =livro;//vai substituir o livro1 pelo novo livro
        System.out.println("Todos os espaços estão ocupados. Então o livro1 será substituído pelo novo livro");
    }
}

//Metodo para remover um livro
    public void removerLivro(Livro livro){
    if (livro1 == livro){
        livro1 = null;
    } else if (livro2 == livro) {
        livro2 = null;
    } else if (livro3 == livro) {
        livro3 = null;
    } else if (livro4 == livro) {
        livro4 = null;
    } else if (livro5 == livro) {
        livro5 = null;
    }
        System.out.println("Livro removido com sucesso!");
    }
    //Método para atualizar os detalhes de um livro
    public void atualizarDetalhesLivro(Livro livro,String novoTitulo, String novoAutor, int novoAnoPublicacao){
    if (livro == livro1){
        livro1.setTitulo(novoTitulo);
        livro1.setAutor(novoAutor);
        livro1.setAnoPublicacao(novoAnoPublicacao);
    } else if (livro == livro2) {
        livro2.setAutor(novoAutor);
        livro2.setTitulo(novoTitulo);
        livro2.setAnoPublicacao(novoAnoPublicacao);
    } else if (livro == livro3) {
        livro3.setTitulo(novoTitulo);
        livro3.setAutor(novoAutor);
        livro3.setAnoPublicacao(novoAnoPublicacao);
    } else if (livro == livro4) {
        livro4.setTitulo(novoTitulo);
        livro4.setAutor(novoAutor);
        livro4.setAnoPublicacao(novoAnoPublicacao);
    } else if (livro == livro5) {
        livro5.setAutor(novoAutor);
        livro5.setTitulo(novoTitulo);
        livro5.setAnoPublicacao(novoAnoPublicacao);
    }else {
        System.out.println("Não existe este livro! Então não é impossiível atualizar os dados");
    }
    }

    //Método para ver a disponibilidade de um livro
    public boolean verificarDisponibilidadedeLivro(Livro livro){
    if (livro1 == livro){
        return livro1.isDisponibilidade();
    } else if (livro2 == livro) {
        return livro2.isDisponibilidade();
    } else if (livro3 == livro) {
        return livro3.isDisponibilidade();
    } else if (livro4 == livro) {
        return livro4.isDisponibilidade();
    } else if (livro5 == livro) {
        return livro5.isDisponibilidade();
    }else {
        return false;
    }
    }

}



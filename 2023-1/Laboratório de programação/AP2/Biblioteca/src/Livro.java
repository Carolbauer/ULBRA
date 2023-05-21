//classe livro herdada de produto
public class Livro extends Produto{
    String autor;
    int anoPublicacao;
    boolean disponibilidade;
    boolean excluido;

    //construtor
    public Livro(String titulo, String autor,int anoPublicacao,boolean disponibilidade) {
        super(titulo);//chamar o construtor da classe pai produto
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponibilidade = disponibilidade;

    }

    //getters e setters


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }


    //impelmentando método
    @Override
    public String detalhesDoProduto() {

        return
                "Informações do Livro:\n"+
                "Titulo:" +getTitulo() + "\n"+
                "Autor:" +getAutor() + "\n" +
                "Ano de publicação:" + getAnoPublicacao() + "\n"+
        "Disponibilidade:" + " " + (isDisponibilidade() ? "Sim" : "Não" + "\n");

    }
}

import java.security.PrivateKey;
// classe abstrata
public abstract class Produto {
     String titulo;

    //construtor
    public Produto(String titulo) {
        this.titulo = titulo;

    }

    //GETTERS E SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //metodo abstrato para receber detalhes do produto
    public abstract String detalhesDoProduto();
}
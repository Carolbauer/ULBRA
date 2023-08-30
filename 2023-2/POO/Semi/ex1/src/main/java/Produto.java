public class Produto {
    private String nome;
    private final double valor;
    private final String descricao;

    public Produto(final String nome, final double valor, final String descricao) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

}

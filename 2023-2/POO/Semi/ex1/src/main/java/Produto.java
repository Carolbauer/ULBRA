public class Produto {
    private String nome;
    private final double valor;
    private final String descricao;

    public Produto(String nome, double valor, String descricao) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return this.valor;
    }

}

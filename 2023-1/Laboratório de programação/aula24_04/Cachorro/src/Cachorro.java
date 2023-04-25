public class Cachorro {
    private String nome;
    private String raca;
    private double preco;

    public Cachorro(String nome, String raca, double preco){
        this.nome  = nome;
        this.raca = raca;
        this.preco =  preco;
    }

    public  Cachorro(String nome,  String raca){
        this.nome  = nome;
        this.raca = raca;
        this.preco = 15.00;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setAutor(String raca) {
        this.raca = raca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

public class Cachorro {
    private String nome;
    private String raca;
    private int idade;

    public Cachorro(String nome, String raca, int idade){
        this.nome  = nome;
        this.raca = raca;
        this.idade =  idade;
    }

    public  Cachorro(String nome,  String raca){
        this.nome  = nome;
        this.raca = raca;
        this.idade = 5;
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

    public double getIdade() {
        return idade;
    }

    public void setPreco(double preco) {
        this.idade = idade;
    }
}

public class Animal {
    private String nome;
    private int idade;
    private double peso;
    private String especie;

    //construtor

    public Animal(String nome, int idade, double peso, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.especie = especie;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    //sobrecarga de método
    public void movimentar(String tipoMovimento) {
        System.out.println("O animal se moveu de maneira " + tipoMovimento);
    }

    public void movimentar() {
        System.out.println("O animal se moveu de maneira padrão");
    }
}

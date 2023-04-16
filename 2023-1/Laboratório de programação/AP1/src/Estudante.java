public class Estudante {
    private String nome;
    private int idade;
    private int pontos;

    public Estudante(String nome, int idade, int pontos){
        this.nome = nome;
        this.idade = idade;
        this.pontos = pontos;
    }
    public String getNome(){
        return this.nome;
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

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}

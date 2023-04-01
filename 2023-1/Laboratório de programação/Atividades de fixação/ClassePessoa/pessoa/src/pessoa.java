/*Crie uma classe chamada "Pessoa" que representará uma pessoa. Esta classe deve ter:
Três atributos privados: "nome" (String), "idade" (int) e "altura" (double).
Métodos públicos para obter (get) e definir (set) os valores dos atributos.*/
public class pessoa {
    private String nome;
    private int idade;
    private double altura;

    public pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //método de acesso.
    public int getIdade() {
        return idade;
    }

    //método de modificação
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

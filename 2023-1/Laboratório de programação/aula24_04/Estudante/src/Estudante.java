import java.util.SplittableRandom;
/*Exercício 1:
Criar uma classe "Estudante" com os atributos "nome", "matricula" e "curso".
Definir construtores para a classe:
Construtor que recebe todos os atributos como parâmetros.
Construtor que recebe apenas "nome" e "matricula" e define um valor padrão para "curso".
Criar objetos do tipo "Estudante" utilizando os construtores definidos.*/
public class Estudante {
    private String nome;
    private int matricula;
    private String curso;

    public Estudante(String nome, int matricula, String curso){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    // recebendo o nome e matricua como parâmetro e definindo valor do curso
    public Estudante(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = "Análise e Desenvolvimento de sistemas";
    }
// getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}

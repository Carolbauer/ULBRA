public class Veterinario extends Funcionario{
    private String especialidade;
    //construtor

    public Veterinario(String nome, String cargo, double salario, String especialidade) {
        super(nome, cargo, salario);
        this.especialidade = especialidade;
    }

    //getters e setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    //metodo
    public void realizarExame(Animal animal){
        System.out.println("O veterinário" + getNome() + " está realizando exame no animal" + animal.getNome());
    }


}

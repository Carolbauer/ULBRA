public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    //construtor
    public Funcionario(String nome, String cargo,double salario ){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }
    public double getSalario() {
        return salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

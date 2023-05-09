public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.idade = 15;
        pessoa.nome = "Fulano";

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Beltrano";
        funcionario.idade = 20;
        funcionario.cargo = "Desenvolvedor";

        System.out.println("Nome:" + pessoa.nome + " " + " Idade: " + pessoa.idade);
        System.out.println("Nome " + funcionario.nome + " " + "Idade:" + funcionario.idade + " " + "Cargo:" + funcionario.cargo);
    }
}
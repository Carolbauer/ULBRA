public class Zoo {
    private Animal[] animais;
    private Funcionario[] funcionarios;
    private int numAnimais;
    private int numFuncionarios;

    public Zoo(int numAnimais, int numFuncionarios){
        this.animais = new Animal[numAnimais];
        this.funcionarios = new Funcionario[numFuncionarios];
    }

    public void adicionarAnimal(Animal animal){
        if(numAnimais < animais.length){
            animais[numAnimais] = animal;
            numAnimais++;
            System.out.println("Animal adicionado com sucesso!!!");
        }else {
            System.out.println("OPS! lIMITE DE MÁXIMO DE ANIMAIS ATINGIGIDO");
        }
    }
    public void adicionarFuncionario(Funcionario funcionario){
        if(numFuncionarios < funcionarios.length){
            funcionarios[numFuncionarios] = funcionario;
            numFuncionarios++;
            System.out.println("Funcionário adicionado com sucesso");
        }else{
            System.out.println("Ops! Limite máximo de funcionários atingigido!!!");
        }
    }
}

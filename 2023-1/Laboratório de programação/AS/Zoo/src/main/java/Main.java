public class Main {
    public static void main(String[] args) {
        //uso de classes
        Zoo zoo = new Zoo(5,2);

        Animal animal1 = new Animal("Bob", 5, 6, "cachorro");
        Animal animal2 = new Mamifero("Milk",3,2,"gato", "longa");
        Animal animal3 = new Ave("Birds",1,0.500,"pássaro", 3);

        animal1.movimentar(" correu");
        animal1.movimentar();

        System.out.println("=====================");

        Funcionario funcionario1 = new Funcionario("Alexandre", "tosador", 2000);
        Funcionario funcionario2 = new Funcionario("Roberto", "auxiliar veterinário", 2000);

        Veterinario veterinario1 = new Veterinario("Carla", "Veterinario", 5000, "oftlamo");
        veterinario1.realizarExame(animal1);

        System.out.println("========================");



        Ave ave = new Ave("Apolo",8,2,"papagaio",2);
        ave.realizarTruque();
        ave.voar();

        //Adicionando animais e funcionarios ao zoo
        zoo.adicionarAnimal(animal1);
        zoo.adicionarAnimal(animal2);
        zoo.adicionarAnimal(animal3);
        zoo.adicionarAnimal(ave);

        zoo.adicionarFuncionario(veterinario1);
        zoo.adicionarFuncionario(funcionario1);
        zoo.adicionarFuncionario(funcionario2);




    }
}

public class Main {
    public static void main(String[] args) {
        //uso de classes
        Animal animal1 = new Animal("Bob", 5, 6, "cachorro");
        System.out.println("O nome do animal é: " + animal1.getNome() + "\n Idade: " + animal1.getIdade() + " anos" +
                "\nPeso:" + animal1.getPeso() + " kg" + " \nEspécie: " + animal1.getEspecie());

        System.out.println("=====================");

        Funcionario funcionario1 = new Funcionario("Alexandre", "tosador", 2000);
        System.out.println("Nome do funcionário: " + funcionario1.getNome() + "\nCargo: " + funcionario1.getCargo() + "\nSalário: " + funcionario1.getSalario());

        System.out.println("========================");

        Veterinario veterinario1 = new Veterinario("Carla", "Veterinario", 5000, "oftlamo");
        veterinario1.realizarExame(animal1);

        System.out.println("========================");

        Mamifero mamifero1 = new Mamifero("Puma",5,20,"macaco","curta");
        mamifero1.amamentar();

        System.out.println("========================");

        Ave ave = new Ave("Apolo",8,2,"papagaio",2);
        ave.realizarTruque();
        ave.voar();





    }
}

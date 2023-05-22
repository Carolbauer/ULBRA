public class Peixe extends Animal{
    String nome;

    public Peixe (String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void mover() {
        System.out.println(nome + " está se movendo");
    }

    @Override
    public void dormir() {
        System.out.println(nome + " está dormindo");
    }

    @Override
    public void comer() {
        System.out.println(nome + " está comendo");
    }
}



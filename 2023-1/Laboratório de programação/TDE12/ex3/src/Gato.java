public class Gato extends Animal{
    String nome;

    public Gato(String nome){
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



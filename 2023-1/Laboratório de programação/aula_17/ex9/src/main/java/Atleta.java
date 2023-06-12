public class Atleta implements Andador,Corredor{
    @Override
    public void andar() {
        System.out.println("O Atleta está andando");
    }

    @Override
    public void correr() {
        System.out.println("O Atleta está correndo");

    }
}

public class Main {
    public static void main(String[] args) {
        Guitarra guitarra = new Guitarra();
        guitarra.tocar();
        guitarra.pausar();
        guitarra.parar();

        System.out.println("===================");

        Piano piano = new Piano();
        piano.tocar();
        piano.pausar();
        piano.parar();

        System.out.println("===================");

        Bateria bateria = new Bateria();
        bateria.tocar();
        bateria.pausar();
        bateria.parar();
    }
}

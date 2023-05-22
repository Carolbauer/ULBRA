public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Sadan");
        cachorro.mover();
        cachorro.dormir();
        cachorro.mover();
        System.out.println();

        Gato gato = new Gato("Miau");
        gato.comer();
        gato.dormir();
        gato.mover();
        System.out.println();

        Peixe peixe = new Peixe("Nemo");
        peixe.comer();
        peixe.mover();
        peixe.dormir();
    }
}

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.comer();
        gato.dormir();
        System.out.println("================");

        Cchorro cchorro = new Cchorro();
        cchorro.comer();
        cchorro.dormir();
        System.out.println("================");

        Elefante elefante = new Elefante();
        elefante.comer();
        elefante.dormir();
    }
}

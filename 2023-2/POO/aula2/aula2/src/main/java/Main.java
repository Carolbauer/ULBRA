import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> frutas= new ArrayList<>();

        adicionarFruta(frutas, "Banana");
        adicionarFruta(frutas, "Maçã");
        adicionarFruta(frutas, "Morango");
        adicionarFruta(frutas, "Mamão");
        System.out.println(frutas);

        removerFruta(frutas, "Maçã");
        System.out.println(frutas);

        alterarFruta(frutas, "Banana", "Abacaxi");
        System.out.println(frutas);

    }

    public static void adicionarFruta(ArrayList<String> frutas, String fruta){
        frutas.add(fruta);
    }

    public static void removerFruta(ArrayList<String> frutas, String fruta){
        frutas.remove(fruta);
    }

    public static void alterarFruta(ArrayList<String> frutas, String fruta, String novaFruta){
        frutas.set(frutas.indexOf(fruta), novaFruta);
    }
}

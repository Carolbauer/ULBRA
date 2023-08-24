import java.util.ArrayList;

public class Main {
   //Ponto de entrada da aplicação
    public static void main(String[] args) {
        System.out.println("Hello World!");

         final ArrayList<Double> lista = new ArrayList();
            lista.add(20.0);
            lista.add(30.0);
        final Soma soma = new Soma();

         CalculadoraBasica calc = new CalculadoraBasica();


        calc.calcular(soma, lista);

        double calcResultado = calc.getResultado();
        System.out.println(calcResultado);
    }
}

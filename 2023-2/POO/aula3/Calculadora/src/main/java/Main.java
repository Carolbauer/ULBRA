import java.util.ArrayList;

public class Main {
    public static void main(final String[] args) {
        //lista para calcular
        final ArrayList<Double> lista = new ArrayList<>();
        lista.add(20.0);
        lista.add(30.0);

        //instanciar nosso objeto operador
        final Soma soma = new Soma();
        final Subtracao subtracao = new Subtracao();
        final Divisao divisao = new Divisao();
        final Multiplicacao multiplicacao = new Multiplicacao();

        //instanciar nossa calculadora
        final CalculadoraBasica calculadora = new CalculadoraBasica();

        calculadora.calcular(soma, lista);
        System.out.println(calculadora.getResultado());

        calculadora.calcular(subtracao, lista);
        System.out.println(calculadora.getResultado());

        calculadora.calcular(divisao, lista);
        System.out.println(calculadora.getResultado());

        calculadora.calcular(multiplicacao, lista);
        System.out.println(calculadora.getResultado());


    }


}
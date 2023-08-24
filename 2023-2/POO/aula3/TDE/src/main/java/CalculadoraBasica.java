import java.util.ArrayList;

public class CalculadoraBasica extends Calculadora {
    @Override
    double calcular(final Ioperador operador, final ArrayList<Double> lista) {
        final double resultado = operador.calcular(lista);
        this.setResultado(resultado);
        return resultado;
    }
}

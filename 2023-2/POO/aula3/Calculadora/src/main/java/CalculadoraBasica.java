import java.util.ArrayList;

public class CalculadoraBasica extends Calculadora{

    @Override
    double calcular(Operador operador, ArrayList<Double> lista) {
        this.setResultado(operador.calcular(lista));
         return this.getResultado();
    }

}


import java.util.ArrayList;

abstract class Calculadora {



    private double resultado;
    abstract double calcular(Operador operador, ArrayList<Double> lista);

    public double getResultado() {
        return this.resultado;
    }

    public void setResultado(final double resultado) {
        this.resultado = resultado;
    }
}

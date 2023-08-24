import java.util.ArrayList;

abstract class Calculadora {
    private double resultado;
    abstract double  calcular(Ioperador operador, ArrayList<Double> lista);

    public double getResultado() {
        return resultado;
    }

    public final void setResultado(double resultado) {
        this.resultado = resultado;
    }
}



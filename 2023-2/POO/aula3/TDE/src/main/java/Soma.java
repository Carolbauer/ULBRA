import java.util.ArrayList;

public class Soma implements Ioperador{
    public double calcular(final ArrayList<Double> lista) {
        double resultado = 0.0;
        for (int i = 0; i < lista.size(); i++) {
            resultado += lista.get(i);
        }
        return resultado;
    }

}

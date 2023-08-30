import java.util.ArrayList;

public class Divisao implements Operador{
    @Override
    public double calcular(final ArrayList<Double> lista) {
        double resultado = 0.0;
        for(int i = 0; i < lista.size(); i++){
            if(0 == i){
                resultado = lista.get(0);
            }else {
                resultado /= lista.get(i);
            }
        }
        return resultado;

    }
}

public class Trapezio {
    double baseMaior;
    double baseMenor;
    double altura;

    double calcularArea() {
        double area = ((baseMaior + baseMenor) / 2) * altura;
        return area;
    }
}

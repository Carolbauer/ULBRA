//definindo a classe Circulo derivada da classe abstrata FormaGeometrica
public class Circulo extends FormaGeometrica{
    double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}

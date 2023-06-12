public class Circulo implements FiguraGeometrica{
    double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio *raio;
    }
}

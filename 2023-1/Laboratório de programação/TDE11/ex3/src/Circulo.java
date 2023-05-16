public class Circulo extends FiguraGeometrica{
    int raio;

    @Override
    public double calcularArea() {
       double area = Math.PI * raio *raio;
       return area;
    }

    @Override
    public double calcularPerimetro() {

       double perimetro = 2 * Math.PI * raio;
       return  perimetro;
    }
}

public class Triangulo extends FormaGeometrica{
    double lado1;
    double lado2;
    double lado3;
    public Triangulo(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    @Override
    public double calcularArea() {
        double area = (lado1+lado2+lado3)/2;
        return Math.sqrt(area*(area - lado1) * (area - lado2) * (area - lado3));
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}

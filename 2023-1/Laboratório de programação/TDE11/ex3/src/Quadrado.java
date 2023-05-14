public class Quadrado extends FiguraGeometrica {
    double lado;

    public double calcularArea() {
        double area = lado * lado;
      return area;
    }

    public double calcularPerimetro() {
        double perimetro = lado * 4;
        return perimetro;
    }
}

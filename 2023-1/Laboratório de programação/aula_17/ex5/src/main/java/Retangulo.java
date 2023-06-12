public class Retangulo implements FiguraGeometrica{
    double base;
    double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;

    }


    @Override
    public double calcularPerimetro() {
        return 2 * (altura + base);
    }
}

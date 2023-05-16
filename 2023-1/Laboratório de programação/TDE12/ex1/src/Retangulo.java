public class Retangulo extends FormaGeometrica{
    double base;
    double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularPerimetro() {
        return base * altura;
    }

    @Override
    public double calcularArea() {
        return 2 * (base +altura);
    }
}

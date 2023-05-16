public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(23);
        System.out.println("Area do circulo: " + circulo.calcularArea());
        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());

        Retangulo retangulo = new Retangulo(2,10);
        System.out.println("Area do retangulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retangulo:" + retangulo.calcularPerimetro() );

        Triangulo triangulo = new Triangulo(10,10,6);
        System.out.println("Area do Triangulo: " + triangulo.calcularArea() );
        System.out.println("Perimetro do retangulo: " + triangulo.calcularPerimetro());

    }
}

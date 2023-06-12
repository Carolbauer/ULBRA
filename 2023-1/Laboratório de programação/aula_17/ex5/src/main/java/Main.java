public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5,3);
        System.out.println("Area do retangulo:"  + retangulo.calcularArea());
        System.out.println("Perímetro do retangulo:" + retangulo.calcularPerimetro());
        System.out.println("=========================");


        Circulo circulo = new Circulo(3);
        System.out.println("Area do Circulo:"  + circulo.calcularArea());
        System.out.println("Perímetro do circulo" + circulo.calcularPerimetro());
        System.out.println("=========================");


        Triangulo triangulo = new Triangulo(5,9);
        System.out.println("Area do triangulo:"  + triangulo.calcularArea());
        System.out.println("Perímetro do triangulo:" + triangulo.calcularPerimetro());
        System.out.println("=========================");

    }
}

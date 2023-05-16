public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        quadrado.lado = 5;
        System.out.println("ÁREA DO QUADRADO:" + quadrado.calcularArea());
        System.out.println("PERÍMETRO DO QUADRADO:" + quadrado.calcularPerimetro());

        Circulo circulo = new Circulo();
        circulo.raio = 4;
        System.out.println("Area do Círculo:" + circulo.calcularArea());
        System.out.println("PERÍMETRO DO CÍRCULO: " + circulo.calcularPerimetro());



    }
}

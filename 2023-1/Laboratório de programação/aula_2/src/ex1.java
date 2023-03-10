public class ex1 {
    public static void main(String[] args) {
        double nota1 = 8.5;
        double nota2 = 7.5;
        double nota3 = 6.0;
        int peso1 = 3;
        int peso2 = 2;
        int peso3 = 5;
        double parcial1 = nota1 * (double) peso1;
        double parcial2 = nota2 * (double) peso2;
        double parcial3 = nota3 * (double) peso3;
        double media = (parcial1 + parcial2 + parcial3) / (double) (peso1 + peso2 + peso3);
        System.out.println(media);
    }
}

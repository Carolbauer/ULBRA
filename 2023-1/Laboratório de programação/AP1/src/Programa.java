public class Programa {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Caroline", 34, 90);
        Estudante estudante2 = new Estudante("Tiago", 34,70);
        Estudante estudante3 = new Estudante("Pedro",20,85);

        Gincana gincana1 = new Gincana("Java", 0, "null", 0);

        gincana1.adicionarEstudante(estudante1);
        gincana1.adicionarEstudante(estudante2);
        gincana1.adicionarEstudante(estudante3);

        System.out.println("Total de participantes da gincana:" + gincana1.getTotalEstudantes());
        gincana1.exibirVencedor();
    }

}

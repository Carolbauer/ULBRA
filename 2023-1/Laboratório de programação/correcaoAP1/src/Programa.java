public class Programa {
    public static void main(String[] args) {
        Gincana gincana1 = new Gincana();
        gincana1.setNomeGincana("Java");
        Estudante estudante1 = new Estudante();
        estudante1.setNome("Carol");
        estudante1.setPontos(80);
        estudante1.setIdade(34);

        Estudante estudante2 = new Estudante();
        estudante2.setNome("Pedro");
        estudante2.setPontos(100);
        estudante2.setIdade(18);

        gincana1.adicionarEstudante(estudante1);
        gincana1.adicionarEstudante(estudante2);
        gincana1.exibirVencedor();
    }
}

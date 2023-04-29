public class GerenciamentoCampeonato {
    public static void main(String[] args) {
        Equipe equipe1 = new Equipe("ADS");
        Equipe equipe2 = new Equipe("ENF");

        equipe1.registrarVitoria();
        equipe2.registrarVitoria();
        equipe2.registrarDerrota();
        equipe1.registrarEmpate();
        equipe1.registrarVitoria();
        equipe2.registrarDerrota();
        equipe1.registrarDerrota();
        equipe1.registrarEmpate();

        System.out.println("Nome equipe:"+ " " + "  " + "V" + " "+ "D" + " " + "E");
        System.out.println("Equipe 1 - " + equipe1.getNome()+ " " + equipe1.getVitorias() + " " + equipe1.getDerrotas() + " " + equipe1.getEmpates());
        System.out.println("Equipe 2 - " + equipe2.getNome()+ " " + equipe2.getVitorias() + " " + equipe2.getDerrotas() + " " + equipe2.getEmpates());

    }
}

public class GerenciamentoCampeonato {
    public static void main(String[] args) {
        Equipe equipe1 = new Equipe("ADS");
        Equipe equipe2 = new Equipe("ENF");

        equipe1.registrarVitoria(0);
        equipe2.registrarVitoria(0);
        equipe2.registrarDerrota(3);
        equipe1.registrarEmpate(0);
        equipe1.registrarVitoria(0);
        equipe2.registrarDerrota(3);
        equipe1.registrarDerrota(3);
        equipe1.registrarEmpate(0);
        equipe1.exibirInformacoes();
        equipe2.exibirInformacoes();
        /*
        System.out.println("Nome equipe:"+ " " + "  " + "V" + " "+ "D" + " " + "E");
        System.out.println("Equipe 1 - " + equipe1.getNome()+ " " + equipe1.getVitorias() + " " + equipe1.getDerrotas() + " " + equipe1.getEmpates());
        System.out.println("Equipe 2 - " + equipe2.getNome()+ " " + equipe2.getVitorias() + " " + equipe2.getDerrotas() + " " + equipe2.getEmpates());
         */
    }
}

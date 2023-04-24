public class Gincana {
    private String nomeGincana;
    private  int totalEstudantes;

    private int pontuacaoMaxima;
    private Estudante estudanteVencedor;


    public String getNomeGincana() {
        return nomeGincana;
    }

    public void setNomeGincana(String nomeGincana) {
        this.nomeGincana = nomeGincana;
    }

    public int getTotalEstudantes() {
        return totalEstudantes;
    }

    public void setTotalEstudantes(int totalEstudantes) {
        this.totalEstudantes = totalEstudantes;
    }

    public int getPontuacaoMaxima() {
        return pontuacaoMaxima;
    }

    public void setPontuacaoMaxima(int pontuacaoMaxima) {
        this.pontuacaoMaxima = pontuacaoMaxima;
    }

    public void adicionarEstudante(Estudante estudante){
        totalEstudantes++;
        if (this.estudanteVencedor == null || estudante.getPontos(80) > this.pontuacaoMaxima){
            this.estudanteVencedor = estudante;
            this.pontuacaoMaxima = estudante.getPontos(80);
        }
    }

    public void exibirVencedor(){
        System.out.println("Nome:" + this.estudanteVencedor.getNome());
        System.out.println("Pontos:" + this.estudanteVencedor.getPontos(80));
    }

}

public class Gincana {
    private String nomeGincana;
    private int totalEstudantes;
    private Estudante estudanteVencedor;
    private int pontuacaoMaxima;

    public Gincana(String nomeGincana, int totalEstudantes, String estudanteVencedor, int pontuacaoMaxima){
       this.nomeGincana = nomeGincana;
       this.totalEstudantes = 0;
       this.estudanteVencedor = null;
       this.pontuacaoMaxima = 0;
    }

    public void setNomeGincana(String nomeGincana) {

        this.nomeGincana = nomeGincana;
    }

    public String getNomeGincana() {
        return nomeGincana;
    }

    public void setTotalEstudantes(int totalEstudantes) {

        this.totalEstudantes = totalEstudantes;
    }

    public int getTotalEstudantes() {

        return totalEstudantes;
    }

    public void setEstudanteVencedor(Estudante estudanteVencedor) {

        this.estudanteVencedor = estudanteVencedor;
    }

    public Estudante getEstudanteVencedor() {

        return estudanteVencedor;
    }

    public void setPontuacaoMaxima(int pontuacaoMaxima) {

        this.pontuacaoMaxima = pontuacaoMaxima;
    }

    public int getPontuacaoMaxima() {

        return pontuacaoMaxima;
    }

    public void adicionarEstudante(Estudante estudante){
        this.totalEstudantes ++; //incrementa total estudantes em 1

        if(estudante.getPontos() > pontuacaoMaxima){
            estudanteVencedor =  estudante;
            pontuacaoMaxima = estudante.getPontos();
            System.out.println("Estudante vencedor atualizado com sucesso");
        }
    }

    public void exibirVencedor(){
        if(estudanteVencedor == null){
            System.out.println("Não há vencedor ainda.");
        }else{
            System.out.println("O estudante vencedor é" + " "  +
                    estudanteVencedor.getNome() + " com " + estudanteVencedor.getPontos() + " pontos!");
        }

    }
}



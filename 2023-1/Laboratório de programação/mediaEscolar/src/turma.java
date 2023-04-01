public class turma {
    private aluno aluno1;
    private aluno aluno2;
    private aluno aluno3;

    public turma(aluno aluno1, aluno aluno2, aluno aluno3){
        this.aluno1 = aluno1;
        this.aluno2 = aluno2;
        this.aluno3 = aluno3;
    }

    public double calcularMedia(){
        double media_aluno1 = this.aluno1.calcularMedia();
        double media_aluno2 = this.aluno2.calcularMedia();
        double media_aluno3 = this.aluno3.calcularMedia();
        double mediaTurma = (media_aluno1 + media_aluno2 + media_aluno3) / 3;

        return mediaTurma;

    }
}

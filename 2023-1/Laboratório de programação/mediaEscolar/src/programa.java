public class programa {
    public static void main(String[] args) {
        //prova dos alunos
        prova prova1_aluno1 = new prova(4, 6);
        prova prova2_aluno1 = new prova(3, 8);

        prova prova1_aluno2 = new prova(10, 5);
        prova prova2_aluno2 = new prova(9, 8);

        prova prova1_aluno3 = new prova(1, 7.5);
        prova prova2_aluno3 = new prova(6, 5);

        //alunos
        aluno aluno1 = new aluno(prova1_aluno1, prova2_aluno1);
        aluno aluno2 = new aluno(prova1_aluno2, prova2_aluno2);
        aluno aluno3 = new aluno(prova1_aluno3, prova2_aluno3);

        //turma
        turma turma = new turma(aluno1,aluno2,aluno3);

        //mostrando as médias de cada aluno

        System.out.println("Média aluno 1:" +  " " + aluno1.calcularMedia());
        System.out.println("Media aluno 2" +  " " + aluno2.calcularMedia());
        System.out.println("Media aluno 3" +  " " + aluno3.calcularMedia());

        //media turma

        System.out.println("A média da turma é:" + turma.calcularMedia());
    }

}



import org.w3c.dom.ls.LSOutput;

public class Programa {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Caroline", 13456);
        Estudante estudante2 = new Estudante("Pedro", 34556);

        System.out.println(estudante1.getNome() + " " + estudante1.getMatricula() + " " + estudante1.getCurso());
        System.out.println(estudante2.getNome() + " " + estudante2.getMatricula()+ " " + estudante1.getCurso());
    }
}

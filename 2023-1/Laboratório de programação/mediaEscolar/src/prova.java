public class prova {
    private double nota_parte1;
    private double nota_parte2;

    public prova(double nota_parte1, double nota_parte2){
        this.nota_parte1 = nota_parte1;
        this.nota_parte2 = nota_parte2;
    }

    public double calcularNotaTotal(){
        double nota_Total = this.nota_parte1 + this.nota_parte2;
        if(nota_Total >10){
            nota_Total = 10;
        }
        return nota_Total;
    }

}

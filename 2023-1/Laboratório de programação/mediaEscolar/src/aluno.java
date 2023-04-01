public class aluno {
    private prova prova1;
    private prova prova2;
   public aluno (prova prova1, prova prova2){
       this.prova1 = prova1;
       this.prova2 = prova2;
   }

   public double calcularMedia(){
       double nota_total1 = this.prova1.calcularNotaTotal();
       double nota_total2 = this.prova2.calcularNotaTotal();
       double media = (nota_total1 +nota_total2) / 2;
       return media;
   }
}

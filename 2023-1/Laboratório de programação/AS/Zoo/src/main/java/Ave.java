public class Ave extends Animal implements Treinavel{
    private double invergaduraAsa;

    public Ave(String nome, int idade, double peso, String especie, double invergaduraAsa) {
        super(nome, idade, peso, especie);
        this.invergaduraAsa = invergaduraAsa;
    }

    public double getInvergaduraAsa() {
        return invergaduraAsa;
    }

    public void setInvergaduraAsa(double invergaduraAsa) {
        this.invergaduraAsa = invergaduraAsa;
    }

    public void realizarTruque() {
        System.out.println(getNome()+" realizou um truque");
    }

    public void voar(){
        System.out.println(getNome() + " está voando");
    }
}

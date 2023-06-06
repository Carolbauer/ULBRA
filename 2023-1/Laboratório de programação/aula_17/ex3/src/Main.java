//Crie uma interface chamada `Voador` com os métodos `decolar`,
// `voar` e `aterrar`. Implemente essa interface nas classes `Aviao`, `Pássaro` e `Superman`.
public class Main {
    public static void main(String[] args) {
        Superman superman = new Superman();
        superman.decolar();
        superman.voar();
        superman.aterrar();

        System.out.println("==================================");

        Passaro passaro = new Passaro();
        passaro.decolar();
        passaro.voar();
        passaro.aterrar();

        System.out.println("==================================");

        Aviao aviao = new Aviao();
        aviao.voar();
        aviao.decolar();
        aviao.aterrar();


    }
}

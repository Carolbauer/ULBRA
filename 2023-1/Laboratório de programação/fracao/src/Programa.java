public class Programa {
    public static void main(String[] args) {
        /*criar a fracao 5/2 e definir valores*/
        Fracao f1 = new Fracao(3, 4);
        /*criar a fracao 1/7 e definir valores*/
        Fracao f2 = new Fracao(5, 6);
        /*multiplica as fracoes*/
        Fracao resultado = f1.multiplicar(f2);

        /*mostra o valor do numerador e denominador, no caso a fracao e seu valor*/
        System.out.println("Resultado: " + resultado.getNumerador() + "/" + resultado.getDenominador());
    }
}

//Começando em 0, imprima os números seguintes, enquanto a soma dos números já
//impressos for menor que 100.
public class ex2_3 {
    public static void main(String[] args){
        int soma = 0;
        int i = 0;

        while (soma + i < 100){
            System.out.println(i);
                    soma +=i;
            i++;
        }

    }
}
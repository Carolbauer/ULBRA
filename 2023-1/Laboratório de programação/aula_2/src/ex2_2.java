//Imprima a soma dos números de 1 a 100, pulando de dois em dois (1, 3, 5, 7, etc.).
public class ex2_2 {
    public static void main(String[] args){
        int i = 1;
        int soma = 0;
        while(i <= 100){
            soma += 1;
            i += 2;
        }
        System.out.println("A soma dos números de 1 a 100, pulando de 2 em 2 = " + soma);

    }
}

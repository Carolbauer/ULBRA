import java.util.Scanner;
/*Faça um programa em Java que solicita um número
inteiro positivo e calcule a soma dos números naturais
até esse número. Utilize um loop while para realizar o
cálculo.
* */
public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = input.nextInt();

        int soma = 0;
        int i = 1;

        while (i <= n) {
            soma += i;
            i++;
        }

        System.out.println("A soma dos números naturais até " + n + " é " + soma);
    }
}

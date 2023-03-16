import java.util.Scanner;

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

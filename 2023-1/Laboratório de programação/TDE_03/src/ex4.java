import java.util.Scanner;
/*Escreva um programa em Java que solicita um número
inteiro positivo e imprime todos os números pares entre 1
e esse número. Utilize um loop while para realizar a
impressão.*/
public class ex4 {
    public static void main(String[] args) {
        int numero = 0;
        int i = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = input.nextInt();

        while (i <= numero){
            if (i % 2 == 0){
                System.out.println("os números pares são: " + " "+  i  + " " );
            }
            i++;
            }
    }
}

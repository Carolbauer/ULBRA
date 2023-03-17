import java.util.Scanner;
/*Escreva um programa em Java que solicita um número
inteiro positivo e imprime a tabuada desse número até o
número 10. Utilize um loop for para realizar a impressão.*/
public class ex3 {
    public static void main(String[] args) {
        int numero = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = input.nextInt();

        for (int i = 0; i <=10; i++){
            int tabuada = numero * i;
            System.out.println(numero + "x" + i + "=" + tabuada);

        }
    }
}

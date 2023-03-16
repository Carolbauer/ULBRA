import java.util.Scanner;

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

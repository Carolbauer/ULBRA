import java.util.Scanner;
/*Escreva um programa em Java que recebe um número
inteiro positivo e imprime se ele é um número primo ou
não. Utilize um loop for para testar se o número é primo.*/
public class ex2 {

    public static void main(String[] args) {
        int numero = 0;
        int cont = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        numero = input.nextInt();

        for (int i =1; i <= numero; i ++){
            if(numero % i == 0){
                cont ++;
            }

        }if(cont == 2){
            System.out.println("O número" + " " + numero + "é primo" );
        }else{
            System.out.println("O número" + " " + numero + " não é primo");
        }
    }
}

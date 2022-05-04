#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){
    int opUsuario;
    float num1, num2,total;
    printf("Menu\n");
    printf("1 - Somar dois números:\n");
    printf("2 - Raiz quadrada de um número\n");
    do{
    printf("Digite uma opção:\n");
    scanf ("%d",&opUsuario);
    } while (opUsuario != 1 && opUsuario !=2);
    if (opUsuario ==1){
        printf ("Digite um número:\n");
        scanf ("%f",&num1);
        printf("Digite o segundo número:\n");
        scanf("%f",&num2);
        total = num1+num2;
        printf("A soma de %.2f + %.2f = %.2f\n", num1, num2, total);
    }else if (opUsuario ==2){
        printf("Digite um número:\n");
        scanf("%f", &num1);
        total = sqrt(num1);
        printf("A raiz quadrada de %.2f é: %.2f \n", num1, total);
    }
        
        return 0;

}
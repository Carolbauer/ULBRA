#include <stdio.h>
#include <stdlib.h>

int main (){
    float num1, num2;
    printf("Digite o primeiro número:\n");
    scanf("%f%*c",&num1);
    printf("Digite o segundo número:\n");
    scanf("%f%*c",&num2);
    if(num1==num2){
        printf ("NÚMEROS IGUAIS\n");
    }else if (num1 < num2){
        printf("o número de maior valor é:%.2f",num2);
    }else if(num2 < num1){
        printf ("O número de maior valor é:%.2f",num1);
    }
    return 0;
}
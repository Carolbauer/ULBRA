#include <stdio.h>
#include <stdlib.h>

int main(){
    float num1, num2, soma;
    printf("Digite um número:\n");
    scanf("%f%*c",&num1);
    printf("Digite o segundo número:\n");
    scanf("%f%*c",&num2);
    if (num1>num2){
        soma = num1 + 100;
        printf("O resultado é:%.2f\n",soma);
    }else if (num2 > num1){
        soma = num2 + 100;
        printf("o resultado é:%.2f\n",soma);
       
    }
    return 0;
}
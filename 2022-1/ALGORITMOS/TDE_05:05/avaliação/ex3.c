#include <stdio.h>
#include <stdlib.h>

int main(){
    float num1,num2,subtracao;
    printf("Digite o primeiro número:\n");
    scanf("%f%*c", &num1);
    printf("Digite o segundo número:\n");
    scanf("%f%*c",&num2);
    if(num1 > num2){
        subtracao = num1-num2;
        printf("A diferença do maior para o menor é:%.2f\n", subtracao);
    }else if (num2 > num1){
        subtracao = num2 - num1;
        printf("A diferença do maior para o menor é:%.2f\n",subtracao);
    }
    return 0;
}
#include<stdio.h>

int main(){

    float salario,salarioReceber,imposto;
    printf("Digite seu salário\n");
    scanf("%f%*c",&salario);
    imposto=salario*10/100;
    salarioReceber=salario+50-imposto;
    printf("o salário a Receber:%f",salarioReceber);
    return 0;
}
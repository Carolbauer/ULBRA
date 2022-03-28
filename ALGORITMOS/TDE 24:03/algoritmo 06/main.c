#include <stdio.h>

int main(){

    float salario,salarioReceber,gratificacao,imposto;
    printf("Digite o seu salário\n");
    scanf("%f%*c",&salario);
    gratificacao=salario*5/100;
    imposto=salario*7/100;
    salarioReceber=salario+gratificacao-imposto;
    printf("Salário a receber:%f",salarioReceber);
    return 0;
}
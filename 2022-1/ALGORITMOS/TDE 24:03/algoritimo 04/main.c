#include <stdio.h>

int main(){
    float salario,novosalario;
    printf("Digite seu salario\n");
    scanf("%f%*c",&salario);
    novosalario=salario+salario*25/100;
    printf("Seu novo salário é:%f",novosalario);
    return 0;


}
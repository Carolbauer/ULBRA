#include <stdio.h>>

int main(){
    float salario, percentualaumento,aumento,novosalario;
    printf("Digite o seu salário\n");
    scanf("%f%*c",&salario);
    printf("Digite o percentual de aumento\n");
    scanf("%f%*c",&percentualaumento);
    aumento=salario*percentualaumento/100;
    novosalario =salario+aumento;
    printf("Seu novo salário é:%f",novosalario);
    return 0;
}
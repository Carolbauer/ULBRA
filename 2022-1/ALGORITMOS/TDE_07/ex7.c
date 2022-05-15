#include <stdio.h>
#include <math.h>

int main(){
    float salario, aumento, novoSalario;
    printf("Digite o valor do seu salário:\n");
    scanf("%f%*c",&salario);
    if(salario < 500){
        printf ("O aumento não está autorizado!\n");
    }else{
        aumento = (salario*30/100);
        novoSalario=(salario+aumento);
        printf("o novo salário é:%.2f\n",novoSalario);
    }
    return 0;
}
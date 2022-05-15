#include<stdio.h>
#include<math.h>

int main(){
    float salario, aumento, novoSalario;
    printf("Digite o salário:\n");
    scanf("%f%*c",&salario);
    if (salario <= 300){
       aumento=(salario*35/100);
       novoSalario=(salario+aumento);
       printf("o novo salário é:%.2f\n",novoSalario);
    }
    if(salario > 300){
        aumento=(salario*15/100);
        novoSalario=(salario+aumento);
        printf("O novo salário é:%.2f\n",novoSalario);
    }
    return 0;
}
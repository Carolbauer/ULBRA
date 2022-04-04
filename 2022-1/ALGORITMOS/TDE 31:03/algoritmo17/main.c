#include <stdio.h>

int main (){
    float salario, cheque1, cheque2, cpmf1,cpmf2, saldo;
    printf("Digite o valor do salário:\n");
    scanf("%f%*c",&salario);
    printf("Digite o valor do primeiro cheque:\n");
    scanf("%f%*c",&cheque1);
    printf("Digite o valor do segundo cheque:\n");
    scanf("%f%*c",&cheque2);
    cpmf1=(cheque1*0.38/100);
    cpmf2=(cheque2*0.38/100);
    saldo=(salario-cheque1-cheque2-cpmf1-cpmf2);
    printf("O saldo é:%2.f\n",saldo);
    return 0;
}
#include <stdio.h>
#include <math.h>

int main(){
    float num1,num2,r1,r2;
    printf("Digite o numero 1\n");
    scanf("%f%*c",&num1);
    printf("Digite o numero 2:\n");
    scanf("%f%*c",&num2);
    r1=pow(num1,num2);
    r2=pow(num2,num1);
    printf("O r1 é igual:%2.f\n",r1);
    printf("O r1 é igual:%2.f\n",r2);
    return 0;

}
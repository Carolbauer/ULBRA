#include <stdio.h>

int main(){
    float num1, num2;
    printf("Digite o primeiro número:\n");
    scanf("%f%*c",&num1);
    printf ("Digite o segundo número:\n");
    scanf("%f%*c",&num2);
    if (num2 > num1){
        printf("O menor número é:%.2f\n",num1);
    }else if (num1 > num2){
        printf ("O número menor é:%.2f",num2);
    }
    return 0;
}
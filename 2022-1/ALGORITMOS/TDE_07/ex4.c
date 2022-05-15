#include <stdio.h>

int main (){
    float num1, num2, num3;
    printf ("Digite o primeiro número:\n");
    scanf("%f%*c",&num1);
     printf ("Digite o segundo número:\n");
    scanf("%f%*c",&num2);
     printf ("Digite o terceiro número:\n");
    scanf("%f%*c",&num3);
    if (num1>num2 && num1>num3){
        printf ("O número maior é:%.2f\n",num1);
    }else if (num2>num1 && num2>num3){
        printf ("O número maior é:%.2f\n", num2);
    }else if(num3>num1 && num3>num2){
        printf("O número maior é:%.2f\n", num3);
    }
    return 0;
}
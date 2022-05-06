#include<stdio.h>
#include<stdlib.h>

int main(){
    int num1, num2, num3, num4;
    printf ("Digite o primeiro número:\n");
    scanf("%d%*c",&num1);
    printf ("Digite o segundo número:\n");
    scanf("%d%*c",&num2);
    printf ("Digite o terceiro número:\n");
    scanf("%d%*c",&num3);
    printf ("Digite o quarto número:\n");
    scanf("%d%*c",&num4);
    if(num1 %2 ==0 && num1 %3 == 0 ){
        printf("O número divisel por 2 e 3 é: %d\n",num1);
    }if (num2 %2 ==0 && num2 %3 == 0 ){
        printf("O número divisel por 2 e 3 é: %d\n",num2);
    }if (num3 %2 ==0 && num3 %3 == 0 ){
        printf("O número divisel por 2 e 3 é: %d\n",num3);
    }if (num4 %2 ==0 && num4 %3 == 0 ){
       printf("O número divisel por 2 e 3 é: %d\n",num4);
    }

    return 0;
}
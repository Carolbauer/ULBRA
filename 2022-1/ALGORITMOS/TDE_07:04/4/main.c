#include <stdio.h>
#include <stdlib.h>

int main() {
    float num1,num2,num3;
    printf("Digite o primeiro número:\n");
    scanf("%f%*c",&num1);
    printf("Digite o segundo número:\n");
    scanf("%f%*c",&num2);
    printf("Digite o terceiro número:\n");
    scanf("%f%*c",&num3);
    printf("\n\nOrdem crescente:");
    if ((num1 < num2) && (num2 < num3)){
    printf ("%f %f %f",num1,num2,num3);
    }else if ((num1 < num3) && (num3 < num2)){
        printf ("%f %f %f", num1, num3, num2);
    } else if ((num2 < num1) && (num1 < num3)){
        printf("%f%f%f", num2, num1, num3);
    } else if ((num2 < num3) && (num3 < num1)){
        printf ("%f%f%f",num2, num3, num1);
    }else if ((num3 < num1) && (num1 < num2)){
        printf("%f%f%f", num3 , num1 , num2);     
    } else {
        printf ("%f%f%f",num3,num2,num1);
    }
    

}
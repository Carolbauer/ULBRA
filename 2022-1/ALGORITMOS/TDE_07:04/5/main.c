#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int main(){
    float num1,num2,num3,num4;
    printf ("Digite 3 números em ordem crescente:\n");
    scanf("%f%*c",&num1);
    scanf("%f%*c",&num2);
    scanf("%f%*c",&num3);
    printf ("Digite um número fora da ordem:\n");
    scanf("%f%*c",&num4);
    if (num4 > num3){
        printf ("A ordem descrescente é:\n""%f %f %f %f",num4, num3,num2,num1);
    }
    else if ((num4 > num2) && (num4 < num3)){
        printf ("A ordem descrescente é:\n""%f %f %f %f",num3,num4,num2,num1);
    }
    else if((num4 > num1) && (num4 < num2)){
        printf ("A ordem descrescente é:\n""%f %f %f %f", num3,num2,num4,num1);
    }
    else if(num4 < num1){
        printf ("A ordem descrescente é:\n""%f %f %f %f",num3,num2,num1,num4);
        return 0;
    }
}
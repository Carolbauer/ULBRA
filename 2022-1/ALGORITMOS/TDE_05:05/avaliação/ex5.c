#include <stdio.h>
#include <stdlib.h>

int main (){
    int num1, num2;
    printf("Digite número 1:\n");
    scanf("%d%*c",&num1);
    printf("Digite número 2:\n");
    scanf("%d%*c",&num2);
    if (num1 % 2 == 0){
       printf ("O primeiro número é múltiplo de 2\n");
    }else{
        printf ("O primeiro número não é múltiplo de 2\n");
    }
    if (num2 % 2 == 0){
       printf ("O segundo número é múltiplo de 2\n");
    }else{
        printf ("O segundo número não é múltiplo de 2\n");
    }
    return 0;
    
}
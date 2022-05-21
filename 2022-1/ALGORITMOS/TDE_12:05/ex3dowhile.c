#include <stdio.h>
#include <stdlib.h>

int main () {
    int num1, num2, numero, i;
    printf("Digite um número: \n");
    scanf("%d", &num1);
    printf("Digite mais um número: \n");
    scanf("%d", &num2);  

    printf ("A seguir números ímpares entre %d e %d:\n", num1, num2);
    i = num1;
    do { 
        numero = i % 2;
            if (numero % 2 != 0  && i >=num1 && i <=num2)     
            printf ("Numero ímpar: %d\n", i);
        i++;
    } while (i <=num2);
    return 0;
}

    
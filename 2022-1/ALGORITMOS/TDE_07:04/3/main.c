#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main() {
    float numero1, numero2;
    printf ("Digite o número 1:\n");
    scanf ("%f%*c",&numero1);
    printf ("Digite o número 2;\n");
    scanf ("%f%*c",&numero2);    

    if (numero1 > numero2){
        printf ("O número 1 é maior:\n");
    } else if (numero2 > numero1){
        printf ("O número 2 é maior:\n");
    } else if (numero1 == numero2){
        printf ("Os números são iguais\n");
    }
}
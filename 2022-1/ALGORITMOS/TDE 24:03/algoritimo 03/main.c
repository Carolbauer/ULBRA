#include <stdio.h>

int main(){

    float nota1,nota2,nota3,peso1,peso2,peso3,media;
    printf("Digite nota1\n");
    scanf("%f%*c",&nota1);
    printf("Digite peso1\n");
    scanf("%f%*C",&peso1);
    printf("Digite nota2\n");
    scanf("%f%*c",&nota2);
    printf("Digite peso2\n");
    scanf("%f%*c",&peso2);
    printf("Digite nota3\n");
    scanf("%f%*c",&nota3);
    printf("Digite peso3\n");
    scanf("%f%*c",&peso3);
    media = (nota1*peso1+nota2*peso2+nota3*peso3)/peso1+peso2+peso3;
    printf ("A média das notas é:%5f - NOTA1=%.0F - NOTA2=%.3F - NOTA3=%1F",media,nota1,nota2,nota3);
    return 0;
        }
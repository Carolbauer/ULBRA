#include <stdio.h>

int main(){
    float nota1, nota2, nota3,media,soma;
    printf("Digite nota1\n");
    scanf("%f%*c",&nota1);
    printf("Digite nota2\n");
    scanf("%f%*c",&nota2);
    printf("Digite nota3\n");
    scanf("%f%*c",&nota3);
    soma=(nota1+nota2+nota3);
    media=(nota1+nota2+nota3)/3;
    printf("A soma das notas é: %f",soma);
    printf("A media das notas é:%5f - NOTA1=%.0F - NOTA2=%.3F - NOTA3=%.1F",media,nota1,nota2,nota3);
    return 0;
    
}
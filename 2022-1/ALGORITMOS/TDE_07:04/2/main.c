#include<stdio.h>
#include<stdlib.h>

int main(){
    float nota1, nota2,nota3;
    float media,exame;
    printf("Digite a nota 1:\n");
    scanf("%f%*c",&nota1);
    printf("Digite a nota 2:\n");
    scanf("%f%*c",&nota2);
    printf("Digite a nota 3:\n");
    scanf("%f%*c",&nota3);
    media=(nota1+nota2+nota3)/3;
    printf("A media é:%2.f",media);
    if (media>=7 && media<=10){
        printf("Você foi Aprovado:\n");
    } else if ((media>=3)&& (media<7)){
        printf("Exame");
        exame=12 - media;
        printf("Você deve tirar:%2.f",exame);
    } else if ((media >=0)&& (media <3)){
        printf("Reprovado");
    }else{
        printf("DADOS INVÁLIDOS");
    }
    return 0;   
}
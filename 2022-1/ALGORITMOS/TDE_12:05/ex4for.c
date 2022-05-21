/*Efetue um programa que leia a nota de 10 alunos de uma turma. Ao final, deve ser escrita a média geral da turma.*/

#include<stdio.h>

int main(){
    float media, nota,soma;
    int i;
    i=0;
    soma=0;
    for (int i = 0; i < 10; i++){
        printf("Digite uma nota:\n");
        scanf("%f%*c",&nota);
        soma=nota+soma;
    }
    media=soma/10;
    printf("A média da turma é:%f",media);
    return 0;
    
}
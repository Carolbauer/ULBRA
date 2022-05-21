/*Efetue um programa que leia a nota de 10 alunos de uma turma. Ao final, deve ser escrita a média geral da turma. */
#include<stdio.h>

int main(){
    float soma,nota,media;
    int i;
    i=0;
    soma=0;
    do{
        printf("Digite a nota:\n");
        scanf("%f%*c",&nota);
        if (nota >=0 && nota<10){
            soma=nota+soma;
            i++;
        }
    }while (nota >=0 && nota<10);
        media=soma/i;
        printf ("A média é:%f",media);
    }
    


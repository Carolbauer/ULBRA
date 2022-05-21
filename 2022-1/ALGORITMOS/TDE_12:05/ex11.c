/*Faça um programa que leia a matrícula, o nome e às três notas de 10 alunos, e indique para cada aluno, se ele foi aprovado ou não, considere a media 7*/
#include <stdio.h>

int main(){
    int turma=10;
    int matricula;
    char nome[10];
    float nota, media,soma;
    int i,j;
    for ( i = 0; i < turma; i++){
        printf("Digite a matricula\n");
        scanf("%d%*c",&matricula);
        printf("Digite o nome\n");
        scanf("%s%*c",&nome);
        soma=0;
        for (j = 0; j < 3; j++){
            printf("Digite a nota %d\n");
            scanf("%f%*c",&nota);
            soma=nota+soma;
        }
        media=soma/3;
        if (media>=7){
            printf("Parabéns! %s você està aprovado!!\n");
        }else{
            printf("Que pena!! %s voçê está reprovado!!\n");
        }
        
    }
    return 0;
}
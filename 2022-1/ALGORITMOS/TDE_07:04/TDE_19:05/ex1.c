#include <stdio.h>

int main(){
    float soma, nota,media;
    int i;
    i=0;
    soma=0;
    do{
        printf("Digite a nota %d\n",i+1);
        scanf("%f%*c",&nota);
        if (nota>=0){
            soma=nota+soma;
            i++;
        }else{
            printf("Bye,Bye\n");
            break;
        }     
       
    }while (nota>=0);

        media=soma/i;

        printf("a meedia é:%f",media);
        printf("Total de notas de alunos lidas é:%d\n",i);
    }
    

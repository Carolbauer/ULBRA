#include <stdio.h>

int main(){
    float soma,media;
    soma=0;
    float notas[15];
    int i=0;
do
{
    printf("Digite a %dº nota \n", i + 1);
    scanf("%f%*c", &notas[i]);
    i++;
} while (i<15);

    for(i=0;i<=15;i++){
        soma+=notas[i];
    }
    media=soma/15;
  
    printf("A média dos alunos é:%.2f",media);


}

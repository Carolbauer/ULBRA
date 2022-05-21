#include <stdio.h>

int main(){
    int num, soma,media;
    soma = 0;
    for (int i = 0; i < 10; i++){
        printf("Digite um numero\n");
        scanf("%d%*c",&num);
        soma=soma+num;
    }
    media=soma/10;
    printf("A soma dos 10 numeros é:%d\n",soma);
    printf("A media dos 10 numeros é:%d\n", media);
}

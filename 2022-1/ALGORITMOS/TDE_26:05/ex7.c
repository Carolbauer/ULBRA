#include<stdio.h>
#include<stdlib.h>
#include<limits.h>

int main () {
    int vetor[10], i=0, maior,posicao;
    posicao=0;
    maior=vetor[0];

    for(i=1; i<=10; i++){
        printf("Digite um vetor\n");
        scanf("%d", &vetor[i]);
        if(vetor[i]>maior){
            maior=vetor[i];
            posicao=i;
        }
    }
    printf("o maior vetor é: %d e esta na posicao %d\n", maior,posicao);
    
    return 0;
}
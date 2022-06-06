#include<stdio.h>
#include<stdlib.h>
#include<limits.h>

int main () {
    int vetor[10], i=0, menor, maior;
    menor= INT_MAX;
    maior= INT_MIN;

    for(i=0; i<10; i++){
        printf("Digite um vetor\n");
        scanf("%d", &vetor[i]);
        if(menor>vetor[i]){
            menor= vetor[i];    
        }
        if(maior<vetor[i]){
            maior=vetor[i];
        }
    }
    printf(" o menor vetor é: %d\n", menor);
    printf("o maior vetor é: %d\n", maior);
    
    return 0;
}
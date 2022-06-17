#include<stdio.h>

int main(){
    int TAM=15;
    int element[TAM];
    int i;
    for ( int i = 0; i < TAM; i++){
       printf("Digite um elemento inteiro:\n");
        scanf("%d%*c",&element[i]);
    }
    for ( i = 0; i < TAM; i++){
              if (element[i] == 30){
                printf("O valor 30 está  na posição%d\n",i);
              }
    }

    
    
}
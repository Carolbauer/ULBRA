/*Faça um programa para ler 10 números DIFERENTES a serem armazenados em um vetor. Os dados deverão ser armazenados no vetor na ordem que forem sendo lidos, sendo que caso o usuário digite um número que já foi digitado anteriormente, o programa devera pedir para ele digitar outro número. Note que cada valor digitado pelo usuário deve ser pesquisado no vetor, verificando se ele existe entre os números que já foram  fornecidos. Exibir na tela o vetor final digitado.*/
#include <stdio.h>
#include <stdlib.h>

int main(){
    int vet[10];
    int i,j;


    for ( i = 0; i < 10; i++){
        printf("%d - Digite um número:\n",i+1);
        scanf("%d%*c",&vet[i]);
    
    for ( j = 0; j < i; j++){
        if (vet[i]==vet[j]){
           printf("Não repita o número, digite novamente!");
           i--;
        }
    }
    }
     printf("Os números digitados são:\n");
    for ( i = 0; i < 10; i++){
       printf("%d\n",vet[i]);
    }
    

    

    return 0;
}
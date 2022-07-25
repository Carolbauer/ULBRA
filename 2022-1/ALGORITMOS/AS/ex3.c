/*Faça um programa que leia um vetor de 10 posições e verifique se existem valores iguais  e os escreva na tela.*/

#include <stdio.h>
#include <stdlib.h>
#define TAM 10

int main() {

  int vetor[TAM] = {};
  int aux,iguais;
  int i;
for ( i = 0; i < TAM; i++){
 printf("Digite 10 números:\n");
 scanf("%d%*c",&vetor[i]);
}
printf("os numeros repetidos são:\n");
  for (i = 0; i < TAM; i++) {  
    for (aux = i+1; aux < TAM; aux++ ){
      if(vetor[i] == vetor[aux]) {
        iguais=vetor[i];
        printf("%d\n", iguais);
      }
    }
  }
  
  return 0;
}
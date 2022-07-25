#include<stdio.h>


/*1-Faça um programa que leia 10 números inteiros, armazene-os em um vetor, solicite um valor de referência inteiro e: 
a) imprima os números do vetor que são maiores que o valor referência 
b) retorne quantos números armazenados no vetor são menores que o valor de referência 
c) retorne quantas vezes o valor de referência aparece no vetor 
*/

int main(){
    int TAM=3;
    int vetor[TAM];
    int vetorRef;
    int numeroMenor=0;
    int numeroIgual=0;
    int i;

    for (i=0; i<TAM; i++){
        printf("Digite um número :\n");
        scanf("%d%*c",&vetor[i]);
    }

    printf("Digite um numero de referencia:\n");
    scanf("%d%*c",&vetorRef);
    
    for(i=0; i<TAM; i++){
        if (vetor[i] > vetorRef){
           printf( "são maiores que a referencia os números: %d, \n",vetor[i]); 
        }else if(vetor[i] < vetorRef){
            numeroMenor=numeroMenor+1;
            
        }else{
            numeroIgual = numeroIgual+1;
            
        }
        
    }
            
            printf( "Foram digitados: %d numeros menores, \n",numeroMenor);
            printf( "O valor referência aparece:%d vezes",numeroIgual);
}
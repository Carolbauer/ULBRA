/*Efetue um programa que leia 5 números. Para cada número fornecido, escrever se ele é NULO, NEGATIVO ou POSITIVO.*/
#include<stdio.h>

int main(){
    int num;
    int i;
    i=0;
    for (int i = 0; i < 5; i++){
        printf("Digite um numero:\n");
        scanf("%d%*c",&num);
        if (num>0){
            printf("Esse número ee positivo\n");
        }else if (num<0){
            printf("Esse número é negativo\n");
        }else{
            printf("Esse número é nulo\n");
        }
        return 0;
        
    }
    
}
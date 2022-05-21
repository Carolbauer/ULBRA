/*Elabore um programa que escreva a tabuada de um número qualquer*/
#include <stdio.h>
#include<stdio.h>

int main(){
    int n,i;
    i=0;
    printf("Digite um número positivo:\n");
    scanf("%d%*c",&n);
    for (i=1; i < 11; i++){
        printf("%d X %d = %d\n",i,n,(n*i));
    }
    
}
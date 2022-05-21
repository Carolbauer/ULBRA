/*Faça um programa que leia um número N, e realize a soma dos números de 1 a N. Ao final, deve-se escrever o resultado.*/

#include <stdio.h>

int main(){
    int n,i,soma;
    i=0;
    soma=0;
    printf("Digite um número:\n");
    scanf("%d%*c",&n);
    do{
        soma=i+soma;
        i++;
    } while (i<=n);
    printf("a soma de 1 até %d é:%d\n",n,soma);
    
}
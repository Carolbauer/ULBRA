/*Elabore um programa que escreva a tabuada do número 9*/
#include<stdio.h>

int main(){
    int n,i;
    n=9;
    for (i=1; i < 11; i++){
        printf("%d X %d = %d\n",i,n,(n*i));
    }
    
}
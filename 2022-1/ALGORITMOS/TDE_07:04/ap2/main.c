/*Escrever um programa que gera os números de 1000 a 1999 e escreve aqueles que divididos por 11 dão um resto igual a 5.*/
#include<stdio.h>

int main() {
    int i = 1000;
    do{
        if (i % 11 ==5)
            printf("%d\n",i);
            i++;
        
        
    }while (i<=1999);
        return 0;

}
/*Faça um programa para ler uma quantidade indeterminada de valores inteiros. Para cada valor fornecido escrever uma mensagem que indica se cada valor fornecido é PAR ou ÍMPAR. O programa será encerrado imediatamente após a leitura de um valor NULO (zero) ou NEGATIVO.*/
#include <stdio.h>

int main(){
    int num;
    int cont,cPar,cImpar,aPar,aImpar;
    cPar=0;
    cImpar=0;
    cont=0;
    aPar=0;
    aImpar=0;
    do{
        printf( "%d - Digite o número \n",cont+1);
        scanf("%d%*c",&num);
        if (num <=0){
            printf("Número nulo\n");
            break;
        }else if (num %2==0){
            printf("Número PAR!!");
        }else{
            printf("Número impar\n");
        }
        
    } while (num>0);
    
}
    
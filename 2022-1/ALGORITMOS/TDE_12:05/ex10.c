/*Faça um programa para ler 10 valores inteiros. Para cada valor fornecido escrever uma mensagem que indica se cada valor fornecido é PAR ou ÍMPAR*/
#include <stdio.h>
int main(){
    int numero;
    int cont, cPar,cImpar,aPar,aImpar;
    cPar=0;
    cImpar=0;
    cont=0;
    aPar=0;
    aImpar=0;
    do
    {
        printf( "%d - Digite o número \n",cont+1);
        scanf("%d%*c",&numero);
        if(numero==0){
            printf( "Número nulo\n");
        }else if(numero%2==0){
            cPar++;
            aPar=aPar+numero;
            printf( "Número par\n");
        }else{
            cImpar++;
            aImpar+=numero;
            printf( "Número impar\n");
        }
        cont++;
    } while (cont<10);
    

    printf("Foram digitados %d pares\n", cPar);
    printf("Foram digitados %d ímpares\n", cImpar);
    printf("O acumulado de pares é %d \n", aPar);
    printf("O acumulado de ímpares é %d \n", aImpar);
    
}
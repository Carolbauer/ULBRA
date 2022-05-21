#include <stdio.h>

int main(){
    int num, soma, vezes;
    soma = 0;
    int i=0;
    do{
        printf("Digite um número:\n");
       scanf("%d%*c",&num);
       soma=soma+num;
       i++;
    } while (i<10);
    printf("A soma dos 10 números é:%d",soma);
}
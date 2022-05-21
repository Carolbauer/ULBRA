#include <stdio.h>

int main(){
    int num, soma;
    soma = 0;
    int i =0;
    while (i < 10){
        printf("Digite um número %d\n",i+1);
        scanf("%d%*c",&num);
        soma = num + soma;
        i++;
    }
    printf ("A soma dos 10 números é:%d", soma);
}

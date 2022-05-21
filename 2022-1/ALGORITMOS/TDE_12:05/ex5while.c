#include <stdio.h>

int main(){
    int n, i , soma;
    i=0;
    soma=0;
    printf("Digite um número:\n");
    scanf("%d%*c",&n);
    while (i<=n){
        soma=i+soma;
        i++;
    }
    printf("A soma de 1 até%d é:%d\n",n,soma);
}
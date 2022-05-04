#include <stdio.h>

int main(){
    int num;
    printf("Digite um número:\n");
    scanf("%d",&num);
    if (num % 2 ==0){
        printf ("É um número Par!");
    }else{
        printf("É um número ímpar");
    }
    return 0;
}
#include <stdio.h>
#include <stdlib.h>

int main(){
    int idade;
    printf("Digite a sua idade:\n");
    scanf("%d%*c",&idade);
    if(idade >=18){
        printf("Você é maior de idade\n");
    }else{
        printf("Você é menor de idade\n");
    }
    return 0;
}
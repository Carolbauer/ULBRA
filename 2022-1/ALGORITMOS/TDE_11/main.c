#include <stdio.h>

int main(){
    int idade;
    printf("Digite a sua idade:\n");
    scanf("%d%*c",&idade);
    if(idade >=18 && idade <= 70){
        printf("Seu voto é obrigatório!");
    }else if (idade >=16 && idade <18){
        printf ("seu voto é opcinal!");
    }else if(idade > 70){
         printf ("seu voto é opcinal!");
    }else{
        printf("você não pode votar:");
    }
    return 0 ;
}

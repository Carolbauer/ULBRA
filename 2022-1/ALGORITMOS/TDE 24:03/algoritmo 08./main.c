#include<stdio.h>

int main(){
    float deposito,taxa,rendimento,total;
    printf("Digite o valor do depósito\n");
    scanf("%f%*c",&deposito);
    printf("Digite o valor da taxa\n");
    scanf("%f%*c",&taxa);
    rendimento=deposito*taxa/100;
    total=deposito+rendimento;
    printf("o valor dos rendimentos é:%f",rendimento);
    printf("O total é:%f",total);
    return 0;
}
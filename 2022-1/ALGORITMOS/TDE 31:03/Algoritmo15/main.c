#include <stdio.h>

int main(){
    float precoFabrica,percentualDistribuidor,percentualImpostos,valorD,valorI,precoFinal;
    printf("Digite o preço de fábrica\n");
    scanf("%f%*c",&precoFabrica);
    printf("Digite o percentual do Distribuidor:\n");
    scanf("%f%*c",&percentualDistribuidor);
    printf("Digite o percentual de impostos\n");
    scanf("%F%*c",&percentualImpostos);
    valorD=precoFabrica*percentualDistribuidor/100;
    valorI=precoFabrica+percentualImpostos/100;
    precoFinal=precoFabrica+valorD+valorI;
    printf("O valor do percentual do distribuidor é:%2.f\n",valorD);
    printf("O valor dos impostos é:%2.f\n",valorI);
    printf("O preço final é:%2.f\n",precoFinal);
    return 0;

}
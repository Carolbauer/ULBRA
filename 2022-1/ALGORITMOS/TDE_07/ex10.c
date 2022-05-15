#include<stdio.h>

int main(){
     float fabrica, consumidor;
  int imposto, porcentagemDistribuidor;

  printf("O valor do custo de fábrica do veículo é:\n");
  scanf("%f%*c", &fabrica);

  if (fabrica < 12000) {
    porcentagemDistribuidor = (fabrica * 5 / 100);
    consumidor = (fabrica + porcentagemDistribuidor);
    printf("O preço do veículo para o consumidor é:%.2f\n", consumidor);
  }
  else if (fabrica >= 12000 || fabrica <= 25000) {
    porcentagemDistribuidor = (fabrica * 10 / 100);
    imposto = (fabrica * 15 / 100);
    consumidor = (fabrica + porcentagemDistribuidor + imposto);
    printf(" O preço do veículo para o consumidor é:%.2f\n", consumidor);
  }
  else {
    porcentagemDistribuidor = (fabrica * 15 / 100);
    imposto = (fabrica * 20 / 100);
    consumidor = (fabrica + porcentagemDistribuidor + imposto);
    printf(" O preço do veículo para o consumidor é: %.2f\n", consumidor);
  }
  return 0;
  }
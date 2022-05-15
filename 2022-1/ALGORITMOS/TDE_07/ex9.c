#include <stdio.h>

int main(){
    float saldo, credito;
    printf("Digite o saldo médio da conta:\n");
    scanf("%f%*c", &saldo);

  if (saldo > 300 && saldo <= 400) {
    credito = saldo * 25 / 100;
    printf("O saldo médio é:%.2f\n O crédito especial é:%.2f\n", saldo, credito);
  }
  else if (saldo > 200 && saldo <= 300) {
    credito = saldo * 20 / 100;
    printf("O saldo médio é:%.2f\n O crédito especial é:%.2f\n", saldo, credito);
  }
  else if (saldo <= 200) {
    credito = saldo * 10 / 100;
    printf("O saldo médio é:%.2f\n O crédito especial é:%.2f\n", saldo, credito);
  }
  else {
    credito = saldo * 30 / 100;
    printf("O saldo médio é:%.2f\n O crédito especial é:%.2f\n", saldo, credito);
  }
  return 0;
}
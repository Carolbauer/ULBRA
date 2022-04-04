#include <stdio.h>

int main(){
    float pesoRacao,racaoGato1,racaoGato2, total;
    printf("Digite o peso do saco de raçã0:\n");
    scanf("%f%*c",&pesoRacao);
    printf("Digite o valor de ração fornecida ao gato 1:\n");
    scanf("%f%*c",&racaoGato1);
    printf("Digite o valor de ração fornecida ao gato 2:\n");
    scanf("%f%*c",&racaoGato2);
    racaoGato1=(racaoGato1/1000);
    racaoGato2=(racaoGato2/1000);
    total=(pesoRacao - 5 * (racaoGato1+racaoGato2));
    printf("o valor total que sobra da ração é:%2.f\n",total);

    return 0;
}
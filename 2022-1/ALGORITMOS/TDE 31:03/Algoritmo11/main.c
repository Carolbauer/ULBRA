#include <stdio.h>
#include<math.h>

int main(){
    float numero, quadrado, cubo, raiz2, raiz3;
    printf("Digite o numero:\n");
    scanf("%f%*c",&numero);
    quadrado=(numero*numero);
    cubo=(numero*numero*numero);
    raiz2=sqrt(numero);
    raiz3=cbrt(numero);
    printf("numero ao quadrado:%2.f\n",quadrado);
    printf("numero ao cubo:%2.f\n",cubo);
    printf("raiz quadrada do numero:%2.f\n",raiz2);
    printf("raiz cubica do numero:%2.f/n",raiz3);
    return 0;

}
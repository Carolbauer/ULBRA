#include <stdio.h>
#include <math.h>

int main(){
    float pes,jarda,milha,polegada;
    printf("Digite o valor de pés:\n");
    scanf("%f%*c",&pes);
    polegada=pes*12;
    jarda=pes*3;
    milha=pes*1.760;
    printf("O valor de polegada é:%2.f\n",polegada);
    printf("O valor de jarda é:%2.f\n",jarda);
    printf("O valor de milha é:%2.f\n",milha);
    return 0;
}
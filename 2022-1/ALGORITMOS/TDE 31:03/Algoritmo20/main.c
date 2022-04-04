#include <stdio.h>
#include <math.h>

int main(){
    float ang,alt,escada,radiano;
    printf("Digite o valor do angulo:\n");
    scanf("%f%*c",& ang);
    printf("Digite o valor da altura:\n");
    scanf("%f%*c",&alt);
    radiano= ang * 3.14/180;
    escada= alt / sin(radiano);
    printf("A medida da escada é:%2.f\n",escada);
    return 0;

}
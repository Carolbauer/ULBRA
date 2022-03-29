#include<stdio.h>

int main(){

    float area,raio;
    printf("Digite o valor do raio\n");
    scanf("%f%*c",&raio);
    area=3.1415*raio*raio;
    printf("O valor da area é:%f",area);
    return 0;
}
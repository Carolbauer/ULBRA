#include <stdio.h>

int main(){
    float base,altura;
    float area;
    printf("Digite a altura\n");
    scanf("%f%*c",&altura);
    printf("Digite a base\n");
    scanf("%f%*c",&base);
    area=(base*altura)/2;
    printf("O valor da area é:%f",area);
    return 0;
}
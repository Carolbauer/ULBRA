#include <stdio.h>

int main(){
    float altDegrau,altUsuario,quantidadeDegraus;
    printf("Digite a altura dos degraus:\n");
    scanf("%f%*c",&altDegrau);
    printf("Digite a altura do usuário:\n");
    scanf("%f%*c",&altUsuario);
    quantidadeDegraus= altUsuario/altDegrau;
    printf("a quantidade de degraus a subir é:%2.f\n",quantidadeDegraus);
    return 0;
}
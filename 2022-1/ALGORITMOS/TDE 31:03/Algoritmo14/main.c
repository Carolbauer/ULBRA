#include <stdio.h>

int main(){
    int anoDeNascimento,anoAtual,idadeAtual,idade2050;
    printf("Digite o seu ano de nascimento:\n");
    scanf("%d%*c",&anoDeNascimento);
    printf("Digite o ano atual:\n");
    scanf("%d%*c",&anoAtual);
    idadeAtual=anoAtual-anoDeNascimento;
    idade2050=2050-anoDeNascimento;
    printf("A idade atual é:%d",idadeAtual);
    printf("A idade em 2050 será:%d",idade2050);
    return 0;
}
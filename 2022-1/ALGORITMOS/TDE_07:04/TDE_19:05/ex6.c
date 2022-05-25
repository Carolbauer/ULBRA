#include <stdio.h>
#define valida 1234

int main(){
    int i=0;
    int senha;
    while (senha != valida){
        printf("Digite sua senha:\n");
        scanf("%d%*c",&senha);
        if (senha == valida){
            printf("Acesso permitido!!!\n");
            printf("Número de tentativas: %d\n", i);  
            break;
        }else{
            printf("Acesso não permitido, senha incorreta\n");
            i++;
        }
        
    }
    return 0;
}
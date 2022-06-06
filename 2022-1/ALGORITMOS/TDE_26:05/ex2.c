#include <stdio.h>

int main(){
    int valor[6],i;
    for(i=0;i<6;i++){
        printf("Digite os valores:\n");
        scanf("%d%*c",&valor[i]);
    }
    for(i=0;i<6;i++){
        printf("valor digitado:%d\n",valor[i]);
    }
}
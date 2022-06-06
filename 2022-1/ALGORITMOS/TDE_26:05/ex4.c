#include<stdio.h>

int main(){
    int valor[8];
    int x,y,i,soma=0;
    valor[0]=x;
    valor[5]=y;
    for ( i = 0; i < 8; i++){
        printf("digite os valores:\n");
        scanf("%d%*c",&valor[i]);
    }
    for(i = 0; i < 1;i++){
        printf("digite um valor para as posicões x\n");
        scanf("%d%*c",&valor[0]);
        printf("digite um valor para as posicões y\n");
        scanf("%d%*c",&valor[5]);
    }
    soma=valor[0]+valor[5];
    printf("A soma de x e y é:%d\n",soma);
}
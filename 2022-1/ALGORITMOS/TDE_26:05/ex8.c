#include<stdio.h>
#include<stdlib.h>

int main(){
    int valor[6],i;
    printf("Digite 6 números inteiros:\n");
    for(i=0;i<6;i++){
        printf("Digite o valor:\n");
        scanf("%d%*c",&valor[i]);
    }
    printf("a ordem inversa dos números é:");
    for(i=5;i>=0;i--){
        printf("%d,",valor[i]);
    }
    return 0;
}
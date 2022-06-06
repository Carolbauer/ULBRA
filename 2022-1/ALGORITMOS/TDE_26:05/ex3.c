#include <stdio.h>

int main(){
    float num [10],quadrado[10];
    int i;
    for ( i = 0; i < 10; i++){
        printf("Digite os números:\n");
        scanf("%f%*c",&num[i]);
    }
    for(i=0;i<10;i++){
        printf("valor digitado:%.2f\n",num[i]);
    }
    for ( i = 0; i < 10; i++){
        quadrado[i]=num[i]*num[i];
        printf("quadrado:%.2f\n",quadrado[i]);
    }

    
}
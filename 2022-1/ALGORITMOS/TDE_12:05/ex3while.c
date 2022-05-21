#include<stdio.h>

int main(){
    int n1,n2;
    printf("Digite o primeiro número:\n");
    scanf("%d%*c",&n1);
    printf("Digite o segundo número:\n");
    scanf("%d%*c",&n2);
    while (n1<=n2){
        if(n1%2!=0){
        printf("os números impares são:%d\n",n1);
        }
        n1++;
    }
    while (n2<=n1){
        if(n2%2!=0){
        printf("os números impares são:%d\n",n2);
        }
        n2++;
    }
}
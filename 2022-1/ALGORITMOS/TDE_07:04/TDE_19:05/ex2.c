#include <stdio.h>

int main(){
    int num;
    do
    {
        printf("Digite um numero:\n");
        scanf("%d%*c",&num);
        if(num>0){
            printf ("o numero é positivo\n");
        }else if(num<0){
             printf("numero negativo\n");
        }
        else{
           break;
        }
    } while (num!=0);
}
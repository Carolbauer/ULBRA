#include<stdio.h>

int main(){
    int num1,num2;
    do{
        printf("Digite um número:\n");
        scanf("%d%*c",&num1);
        printf("Digite outro número:\n");
        scanf("%d%*c",&num2);
        if (num1 >num2){
            printf("%d   %d   Descrescente\n",num1,num2);

        }else if (num1 <num2){
            printf("%d   %d   Crescente\n",num1,num2);

        }else{
            printf("%d   %d\n",num1,num2);
        }
        
        
        
    } while (num1 != num2);
    return 0;
}
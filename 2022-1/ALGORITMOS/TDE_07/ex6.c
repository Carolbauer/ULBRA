#include <stdio.h>
#include <math.h>

int main(){
    int num1, num2, raiz, elevado, raizcubica,escolha;
    printf("Digite dois números:");
    scanf("%d%*c",&num1);
    scanf("%d%*c",&num2);
    printf("Selecione a operação: \n");
    printf("1 - Primeiro número elevado ao segundo \n");
    printf("2 - Raiz quadrada de cada um dos números\n");
    printf("3 - Raiz cúbica de cada um dos números \n");
    scanf("%d%*c", &escolha);
    if(escolha ==1){
        elevado=pow(num1,num2);
        printf ("O primeiro número elevado ao segundo tem como resposta:%d\n",elevado);
    }
    if (escolha ==2){
        raiz=sqrt(num1);
        printf("A raiz quadrado do primeiro número é:%d\n",raiz);
        raiz=sqrt(num2);
        printf("A raiz quadrado do primeiro número é:%d\n",raiz);
    }
    if (escolha ==3){
        raizcubica=cbrt(num1);
        printf("A raiz quadrado do primeiro número é:%d\n",raizcubica);
        raizcubica=cbrt(num2);
        printf("A raiz quadrado do primeiro número é:%d\n",raizcubica);
    }
    return 0;
}
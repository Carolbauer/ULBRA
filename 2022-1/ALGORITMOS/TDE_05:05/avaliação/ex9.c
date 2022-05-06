#include <stdio.h>
#include <stdlib.h>

int main(){
    float n1, n2, n3, ma;
    printf("Digite a nota 1:\n");
    scanf("%f%*c",&n1);
    printf("Digite a nota 2:\n");
    scanf("%f%*c",&n2);
    printf("Digite a nota 3:\n");
    scanf("%f%*c",&n3);
    ma= (n1+n2+n3)/3;
    printf ("A média é:%.2f\n",ma);
    if(ma >=9){
        printf ("Conceito A, APROVADO!");
    }else if(ma >=7.5 && ma <9 ){
        printf ("Conceito B, APROVADO!");
    }else if(ma >=6 && ma <7.5 ){
        printf ("Conceito C, APROVADO!");
    }else if(ma >=4 && ma <6 ){
        printf ("Conceito D, REPROVADO!");
    }else if(ma <4 ){
        printf ("Conceito E, REPROVADO!");
    }
    return 0;
}
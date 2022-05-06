#include <stdio.h>
int main(){
    float A, B, C, I;
    printf("Digite um valor para A:\n");
    scanf("%f%*c",&A);
    printf("Digite um valor para B\n");
    scanf("%f%*c",&B);
    printf("Digite um valor para C\n");
    scanf("%f%*c",&C);
    printf("Digite um valor para I (1, 2, 3):\n");
    scanf("%f%*c",&I);
    if(I != 1 && I != 2 && I != 3){
        printf("Número incorreto!!!");
    }else if(I==1 && A<B && A<C && B<C){
        printf("A ordem crescente dos números é:%.2f %.2f %.2f",A,B,C);
    }else if(I==1 && A<B && A<C && C<B){
        printf("A ordem crescente dos números é:%.2f %.2f %.2f",A,C,B);
    }else if(I==1 && B<A && B<C && A<B){
        printf("A ordem crescente dos números é:%.2f %.2f %.2f",B,A,C);
    }else if(I==1 && B<A && B<C && C<A){
        printf("A ordem crescente dos números é:%.2f %.2f %.2f",B,C,A);
    }else if(I==1 && C<A && C<B && A<B){
        printf("A ordem crescente dos números é:%.2f %.2f %.2f",C,A,B);
    }else if(I==1 && C<A && C<B && B<A){
        printf("A ordem crescente dos números é:%.2f %.2f %.2f",C,B,A);
    }else if(I==2 && A>B && A>C && B>C){
        printf("A ordem decrescente dos números é:%.2f %.2f %.2f",A,B,C);
    }else if(I==2 && A>B && A>C && C>B){
        printf("A ordem decrescente dos números é:%.2f %.2f %.2f",A,C,B);
    }else if(I==2 && B>A && B>C && A>C){
        printf("A ordem decrescente dos números é:%.2f %.2f %.2f",B,A,C);
    }else if(I==2 && B>A && B>C && C>A){
        printf("A ordem decrescente dos números é:%.2f %.2f %.2f",B,C,A);
    }else if(I==2 && C>A && C>B && A>B){
        printf("A ordem decrescente dos números é:%.2f %.2f %.2f",C,A,B);
    }else if(I==2 && C>A && C>B && B>A){
        printf("A ordem decrescente dos números é:%.2f %.2f %.2f",C,B,A);
    }else if(I==3 && A>B && A>C){
        printf("A ordem desejada é:%.2f %.2f %.2f",B,A,C);
    }else if(I==3 && B>A && B>C){
        printf("A ordem desejada é:%.2f %.2f %.2f",A,B,C);
    }else if(I==3 && C>A && C>B){
        printf("A ordem desejada é:%.2f %.2f %.2f",A,C,B);
    }
    return 0;
}
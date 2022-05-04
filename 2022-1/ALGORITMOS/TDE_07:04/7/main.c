#include <stdio.h>
#include <stdlib.h>

int main(){
    //I = INTEIRO E POSITIVO E A,B,C = NUMEROS REAIS//
    float A, B, C;
    int I;
    printf("Você deve informar três números reais diferentes: \n");   
    printf("Informe o primeiro número real: \n");
    scanf("%f", &A);
    do {
        printf("Informe o segundo número real: \n");
        scanf("%f", &B);
    } while (B == A);
    do {
        printf("Informe o terceiro número real: \n");
        scanf("%f", &C);
    } while (C == A || C == B);

    printf("Agora seleciona uma das opções abaixo: \n");  
    printf("1 - A, B, C em ordem crescente;\n"); 
    printf("2 - A, B, C em ordem decrescente;\n"); 
    printf("3 - O maior fica entre os outros dois números.\n\n");

    do {
        printf("Informe a opção 1, 2 ou 3.\n");     
        scanf("%d", &I);
    } while (I < 1 || I > 3);

    if (I == 1) {
        if (A < B && A < C) {
            if (B < C) {
                printf("A ordem crescente é: %.2f - %.2f - %.2f \n", A, B, C);
            } else {
                printf("A ordem crescente é: %.2f - %.2f - %.2f \n", A, C, B);
            }
        } else if (B < A && B < C) {
            if (A < C) {
                printf("A ordem crescente é: %.2f - %.2f - %.2f \n", B, A, C);
            } else {
                printf("A ordem crescente é: %.2f - %.2f - %.2f \n", B, C, A);
            }        
        } else if (C < A && C < B) {
            if (A < B) {
                printf("A ordem crescente é: %.2f - %.2f - %.2f \n", C, A, B);
            } else {
                printf("A ordem crescente é: %.2f - %.2f - %.2f \n", A, B, A);
            }        
        }
    } else if (I == 2) {
        if (A > B && A > C) {
            if (B > C) {
                printf("A ordem decrescente é: %.2f - %.2f - %.2f \n", A, B, C);
            } else {
                printf("A ordem decrescente é: %.2f - %.2f - %.2f \n", A, C, B);
            }
        } else if (B > A && B > C) {
            if (A > C) {
                printf("A ordem decrescente é: %.2f - %.2f - %.2f \n", B, A, C);
            } else {
                printf("A ordem decrescente é: %.2f - %.2f - %.2f \n", B, C, A);
            }        
        } else if (C > A && C > B) {
            if (A > C) {
                printf("A ordem decrescente é: %.2f - %.2f - %.2f \n", C, A, B);
            } else {
                printf("A ordem decrescente é: %.2f - %.2f - %.2f \n", C, B, A);
            }        
        }
    } else if (I == 3) {
        if (A > B && A > C) {
            printf("A ordem desejada é: %.2f - %.2f - %.2f\n", B, A, C);
        } else if (B > A && B > C) {
            printf("A ordem desejada é: %.2f - %.2f - %.2f\n", A, B,C);           
        } else if (C > A && C > B) {
            printf("A ordem desejada é: %.2f - %.2f - %.2f\n", A, C, B);           
        }
    }
    system("pause");

    return 0;
}
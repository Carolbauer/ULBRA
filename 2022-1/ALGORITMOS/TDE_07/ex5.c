#include <stdio.h>

int main(){
    float num1, num2, media, diferenca,produto,divisao,escolha,sub,multiplicacao;
    printf("Digite o primeiro número:\n");
    scanf("%f%*c",&num1);
    printf("Digite o segunfo número:\n");
    scanf("%f%*c",&num2);
    printf("Selecione a operação: \n");
    printf("1 - Média dos números \n");
    printf("2 - Diferença entre o maior e o menor \n");
    printf("3 - Produto dos números \n");
    printf("4 - Divisão do primeiro pelo segundo \n");
    scanf("%f%*c", &escolha);
    if(escolha ==1){
    media=(num1+num2)/2;
    printf("A média dos números é %.2f",media);
    }
    if(escolha==2){
    if(num1>num2){
        sub=(num1-num2);
        printf("A diferença entre o maior e o menor é %.2f", sub);
    }
    if(num2>num1){
            sub=num2-num1;
            printf("A diferença entre o maior e o menor é %.2f", sub);
        }
        if(num1==num2 && num2==num1){
            printf("Os números são iguais!");
        }
    }
    if(escolha ==3){
        multiplicacao=(num1*num2);
        printf("o produto é:%.2f",multiplicacao);
    }
    if (escolha==4){
        if(num2==0){
            printf("Não pode dividir por zero! Operação encerrada!");
        }
        if (num2!=0){
            divisao=(num1/num2);
            printf("A divisão do numero1 pelo numereo2 é%.2f",divisao);
        }
    }
    if (escolha<=0 || escolha>4){
        printf("Opção inexistente!Operação encerrada.");
        return 0;
    }
    return 0;
}
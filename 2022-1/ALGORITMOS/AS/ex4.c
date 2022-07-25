/*Faça um programa que leia um vetor de 5 posições para  números reais e, depois, um código inteiro. Se o código for zero, finalize o programa; se for 1, mostre o vetor na ordem  direta; se for 2, mostre o vetor na ordem inversa. Caso, o código diferir de 1 e 2  escreva uma mensagem informando que o código  e inválido.*/
#include <stdio.h>

int main() {
  float vetor[5];
  int codigo;
  int i= 0;
  int op;

  for(i=0; i<5; i++){
    printf ("%d - Digite um valor:\n",i);
    scanf("%f%*c", &vetor[i]);
  }
  printf(" ● para ordem direta, digite 1\n ● para ordem inversa, digite 2\n ● para encerrar digite 0\n");
  printf (" Qual opção você deseja:\n");
  scanf("%d%*c",&op);

  
  if(op == 1){
    for(i=0;i<5;i++){
      printf ("%.f, ",vetor[i]);
    }
  }else if (op == 2){
    for(i=4;i>=0;i--){
      printf ("%.f, ",vetor[i]);
    }
  }else if(op == 0){
    printf("Programa sendo encerrado!\n");
  }else{
    printf("numero invalido\n");
  }
  return 0;
}
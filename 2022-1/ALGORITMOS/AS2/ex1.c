/*Preencha um vetor com 100 números inteiros de forma randômica. Quando o número randômico for 999 o preenchimento deve ser encerrado.
Após  preenchido   O Programa deve possibilitar 4 opções:
1- exibir uma lista os números presentes no vetor, não incluído o 999.
2-  imprimir o vetor na ordem inversa.
3-  Exibir o maior número
4 - Exibir quantos números foram sorteados.
5-Encerrar o programa.*/

#include <stdlib.h>
#include <stdio.h>
#include <time.h>

int main()
{
  int vet[100], i, opcao, maior;
  int cont = 0;
  srand(time(NULL));
    printf("Números sorteados:\n");
  for (i = 0; i < 100; i++){
    vet[i] = rand() % 1000;
    printf("%dº número: %d\n",i+1, vet[i]);
    cont++;
    if (vet[i] == 999){
      break;
    }
  }
  do{
    printf("\n Selecione uma opção: \n");
    printf("Para exibir os números presentes no vetor digite 1.\n");
    printf("Para imprimir o vetor na ordem inversa digite 2.\n");
    printf("Para exibir o maior número digite 3.\n");
    printf("Para exibir quantos números foram sorteados digite 4.\n");
    printf("Para encerrar o programa digite 5.\n");
    printf("Digite a sua opção: ");
    scanf("%d%*c", &opcao);

    switch (opcao)
    {
    case 1:
      printf("Os números armazenados no vetor foram: \n");
      for (i = 0; i < cont; i++){
        if (vet[i]==999){
          printf(" ");
      
        }else{
          printf("%dº vetor: %d\n", i+1, vet[i]);
        }
        
        
      }
      break;
    case 2:
      for (i = cont-1; i >= 0; i--){
        printf("%dº vetor: %d\n", i+1, vet[i]);
      }
      break;
    case 3:
      for (i = 0; i < cont; i++)
      {
        if (vet[i] > maior)
        {
          maior = vet[i];
        }
      }
      printf("O maior número é: %d\n", maior);
      break;
    case 4:
      printf("foram sorteados %d números\n", cont);
      break;
    default:
      printf("Programa encerrado!\n");
      break;
    }
  } while (opcao != 5);
  return 0;
}
/*2 - Escreve um programa que sorteie aleatoriamente, 10 números
e armazene estes em um vetor. Em seguida, 
o usuário digita um número e seu programa em C deve acusar se o número digitado está no vetor 
ou não. Se estiver, diga a posição que está.*/

//Digitando um número primeiro, depois sorteando 10 números.

#include <stdio.h>
#include <stdlib.h> // necessário p/ as funções rand() e srand()
#include <time.h> 

int main(void)
{
    int numero[10], numDig;
    int cont = 0;
    int posicao = 0;
    int i = 0;

    printf("Digite um número:\n");
    scanf("%d%*c", &numDig);

    printf("Gerando 10 valores aleatorios:\n");

    srand(time(NULL));

    for (i = 0; i < 10; i++)
    {

        numero[i] = rand() % 100;
        printf("%d - ", numero[i]);

        if (numero[i] == numDig)
        {
            posicao = i;
            cont++;
        }
    }
    if (cont == 0)
    {
        printf("o numero %d nao se encontra no vetor", numDig);
    }
    else if (cont > 0)
    {
        printf("o numero %d encontra-se no vetor na posição %d",numDig, posicao);
    }

    return 0;
}
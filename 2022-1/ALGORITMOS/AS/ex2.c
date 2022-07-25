/*2 - Escreve um programa que sorteio, aleatoriamente, 10 números e armazene estes em um vetor.
Em seguida, o usuário digita um número e seu programa em C deve acusar se o número digitado está no vetor ou não. Se estiver, diga a posição que está.*/

#include <stdio.h>
#include <stdlib.h> // necessário p/ as funções rand() e srand()
#include <time.h>   //necessário p/ função time()

int main(void)
{
    int sorteio[10], numero;
    int i = 0;
    int cont = 0;
    int posVetor = 0;

    printf("Gerando 10 valores aleatorios:\n");

    srand(time(NULL));

    for (i = 0; i < 10; i++)
    {
        sorteio[i] = rand() % 100;
        printf("%d\n", sorteio[i]);
    }
    printf("Digite um número:\n");
    scanf("%d%*c", &numero);

    for (i = 0; i < 10; i++)
    {
        if (sorteio[i] == numero)
        {
            posVetor = i;
            cont++;
            if (cont > 0)
            {
                printf("O numero %d está no vetor e encontra-se na posição %d\n", numero, posVetor);
            }
        }
    }
    if (posVetor == 0)
    {
        printf("O número %d não esta no vetor\n", numero);
    }
    return 0;
}
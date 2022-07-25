/*Faça um algoritmo que Preencha 4 vetores: 
o primeiro com a nota da primeira prova; 
o segundo com a nota da segunda prova;
o terceiro com as média aritmética das 2 primeiras notas;
O Quarto com o nome do Aluno.
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    float prova1[10];
    float prova2[10];
    float media[10];
    char aluno[10][20];
    int cAlunos = 0, opcao, i = 0, op, posicao;
    float nota;

    do
    {
        for (i = 0; i < 10; i++)
        {
            printf("Digite a nota da primeira prova:\n");
            scanf("%f%*c", &prova1[i]);

            printf("Digite a nota da segunda prova:\n");
            scanf("%f%*c", &prova2[i]);

            media[i] = (prova1[i] + prova2[i]) / 2;

            printf("Digite o nome do aluno:\n");
            scanf("%s%*c", &aluno[i]);
            cAlunos++;

            printf("Adicionar novo aluno?\n Para SIM digite 1\n Para NÃO digite 2.\n");
            scanf("%d%*c", &opcao);

            if (opcao == 1)
            {
                continue;
            }
            else if (opcao != 2)
            {
                printf("opção inválida\n");
                break;
            }
            else
            {
                break;
            }
        }
        i++;

    } while (i == 0);

    do
    {
        printf("Para listar todos os alunos aprovados digite 1.\n");
        printf("Para listar todos os alunos reprovados digite 2.\n ");
        printf("Para listar os alunos com a nota maior que uma nota informada digite 3.\n");
        printf("Para informar uma posição e exibir dados e notas do aluno, digite 4.\n");
        printf("Para encerrar o programa, digite 5.\n");
        printf("Digite a opção desejada:\n");
        scanf("%d%*c", &op);

        switch (op)
        {
        case 1:
            printf("Alunos aprovados:\n");
            for (i = 0; i < cAlunos; i++){
                if (media[i] >= 7)
                {
                    printf("%dº aluno:%s com a media %.2f\n",i+1, aluno[i], media[i]);
                }
            }
            break;
        case 2:
            printf("Alunos reprovados:\n");
            for (i = 0; i < cAlunos; i++)
            {
                if (media[i] < 7)
                {
                    printf("%dº aluno:%s com a media %.2f\n",i+1, aluno[i], media[i]);
                }
            }
            break;
        case 3:
            printf("Digite uma nota:\n");
            scanf("%f%*c", &nota);
            printf("alunos com nota maior que a informada:\n");
            for (i = 0; i < cAlunos; i++)
            {
                if (nota < prova1[i] && nota < prova2[i])
                {
                    printf("aluno %s\n", aluno[i]);
                }
            }
            break;
        case 4:
            printf("Digite o numero do aluno que deseja verificar, sendo que foram registrados %d alunos:\n", cAlunos);
            scanf("%d%*c", &posicao);

            for (i = 0; i < cAlunos; i++)
            {
                if (posicao == i+1)
                {
                    printf("%s \nprimeira nota:%.2f\nsegunda nota:%.2f\nobtendo a média:%.2f\n\n ", aluno[i], prova1[i], prova2[i], media[i]);
                }
            }
            break;
        }
    } while (op != 5);
    printf("programa encerrado!!");
}
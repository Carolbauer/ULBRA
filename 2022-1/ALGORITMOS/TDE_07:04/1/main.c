#include<stdio.h>
#include<stdlib.h>

int main(){
    float trabLaboratorio,avSemestral,exFinal,media;
    printf("Digite a nota de Trabalho de Laboratório:\n");
    scanf("%f%*c",&trabLaboratorio);
    printf("Digite a avaliação semestral:\n");
    scanf("%f%*c",&avSemestral);
    printf("Digite a nota do Exame Final:\n");
    scanf("%f%*c",&exFinal);
    media=(trabLaboratorio*2+avSemestral*3+exFinal*5)/10;
    printf("A media ponderada é:%2.f",media);
    if (media>=8 & media<=10)
    {
        printf ("Obteve conceito A\n");
    }
     if (media>=7 & media<8)
     {
         printf ("Obteve conceito B\n");
     }

     if (media>=6 & media<7)
     {
         printf("Obteve conceito C\n");
     }

     if (media>=5 & media<6)
     {
         printf("Obteve conceito D\n");
     }
     
     if (media>=0 & media<5)
     {
         printf("Obteve conceito E\n");
     }
     
}
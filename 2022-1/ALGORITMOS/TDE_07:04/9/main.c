#include <stdio.h>
#include <time.h>

int main (void){
   struct tm *data_hora_atual;
    time_t segundos;
    time(&segundos);
    data_hora_atual = localtime(&segundos);
    int hora = data_hora_atual ->tm_hour;
    int minuto = data_hora_atual ->tm_min;
    int segundo = data_hora_atual ->tm_sec;
    int dia = data_hora_atual ->tm_mday;
    int diaAno = data_hora_atual ->tm_yday;
    int diaSemana = data_hora_atual ->tm_wday;
    int mes = data_hora_atual ->tm_mon+1;
    int ano = data_hora_atual ->tm_year+1900;

    printf ("Dia: %d\n", dia);
    printf ("Mês:%d\n",mes);
    printf ("Ano: %d\n", ano);
    printf ("Dia do Ano: %d\n",diaAno);
    printf ("Dia da Semana:%d\n\n", diaSemana);

    printf("Hora:%d:", hora);
    printf("%d:", minuto);
    printf("%d\n", segundo);

    printf("Data: %d/", dia);
    switch (mes)
    {
    case 1:
        printf("Janeiro");
        break;
    case 2:
        printf("Fevereiro");
        break;
    case 3:
        printf("Março");
        break;
    case 4:
        printf("Abril");
        break;
    case 5:
        printf("Maio");
        break;
    case 6:
        printf("Junho");
        break;
    case 7:
        printf("Julho");
        break;
    case 8:
        printf("Agosto");
        break;
    case 9:
        printf("Setembro");
        break;
    case 10:
        printf("Outubro");
        break;
    case 11:
        printf("Novembro");
        break;  
    default:
        printf("Dezembro");
        break;
   
    }
    printf("/%d\n\n", ano);
    return 0;
 
}
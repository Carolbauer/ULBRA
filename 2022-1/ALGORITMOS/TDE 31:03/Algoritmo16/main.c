#include <stdio.h>

int main (){
    float horasTrab, valorSalMin, valorHoraTrab;
    float salBruto, imposto, salarioReceber;
    printf ("Digite o número de horas trabalhadas:\n");
    scanf ("%f%*c",&horasTrab);
    printf("Digite o valor do Salário mínimo:\n");
    scanf("%f%*c",&valorSalMin);
    valorHoraTrab=(valorSalMin / 2);
    printf("O valor das horas trabalhadas é:%2.f\n",valorHoraTrab);
    salBruto=(valorHoraTrab*horasTrab);
    printf("O valor do salario bruto é:%2.f\n",salBruto);
    imposto=(salBruto* 3 / 100);
    printf("o valor do imposto é:%2.f\n",imposto);
    salarioReceber=(salBruto-imposto);
    printf("O valor do salário a receber é:%2.f\n",salarioReceber);
    return 0;
}
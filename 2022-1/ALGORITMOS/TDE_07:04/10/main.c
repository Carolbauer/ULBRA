
#include <stdio.h>
#include <stdlib.h>

int main(){
  int dia1, dia2, mes1, mes2, ano1, ano2, totaldata1, totaldata2;
  printf ("Digite um dia , um mês e um ano da sua escolha:\n");
  scanf ("%d%*c", &dia1);
  scanf ("%d%*c", &mes1);
  scanf ("%d%*c", &ano1);
  printf ("Digite mais um dia, um mês e um ano da sua escolha:\n");
  scanf ("%d%*c", &dia2);
  scanf ("%d%*c", &mes2);
  scanf ("%d%*c", &ano2);
  totaldata1 = dia1 + mes1 +ano1;
  totaldata2 = dia2 + mes2 +ano2;

  if (totaldata1 > totaldata2) {
      printf ("A maior data digitada foi %d/%d/%d", dia1, mes1,ano1);
  }
  else{
      printf("A maior data digitada foi %d/%d/%d", dia2, mes2, ano2);
  }
  return 0;
}

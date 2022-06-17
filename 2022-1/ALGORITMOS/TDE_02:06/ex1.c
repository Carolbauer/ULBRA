#include <stdio.h>

int main(){
    int num[6],par=0,impar=0;
for (int i = 0; i < 6; i++){
    printf("%d - Digite um numero:\n",i+1);
    scanf("%d%*c",&num[i]);
}
for (int i = 0; i < 6; i++){
    if (num[i]%2 == 0){
      par=par+1;
      printf("%d é par!",num[i]);
      printf("total de numeros pares:%d\n",par);
    }
}
for (int i = 0; i < 6; i++){
    if (num[i]%2 != 0){
      impar=impar+1;
      printf("%d é impar!",num[i]);
      printf("total de numeros impares:%d\n",impar);
    }
}
}

   
#include <stdio.h>

int main(){
    int num[7];
   int i;
   for(i=0; i < 7;i++){
       printf("Digite o numero:\n");
       scanf("%d",&num[i]);

       if (num[i]%2== 0 && num[i]%3 == 0){
           printf("Numero %d é multiplo de 2 e 3",num[i]);
       }else if (num[i]%3 == 0){
          printf("Numero %d é multiplo de 3",num[i]);
       }else if (num[i]%2 == 0){
          printf("Numero %d é multiplo de 2",num[i]);
       
   }

}
}
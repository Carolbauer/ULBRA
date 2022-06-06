  #include <stdio.h>

int main(){
    int i, numero;
    int valor[6];
    i=0;
do
{
    printf("Digite o %dº valor\n", i + 1);
    scanf("%d%*c", &numero);
    if(numero%2==0){
        valor[i]=numero;
        i++;
    }
} while (i<6);

    for(i=5;i>=0;i--){
        printf("%d\n", valor[i]);
    }


}

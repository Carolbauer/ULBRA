#include <stdio.h>

int main(){
    float n1, n2, media;
    printf("Digite a primeira nota:\n");
    scanf("%f%*c",&n1);
    printf("Digite a segunda nota:\n");
    scanf("%f%*c",&n2);
    media=(n1+n2)/2;
    printf("Sua média é:%.2f\n",media);
    if(media <4){
        printf("Você foi reprovado:\n");
    }else if(media >=4 && media <7){
        printf("EXAME");
    }else if (media >= 7 && media <10){
        printf("APROVADO!");
    }
    return 0;
}
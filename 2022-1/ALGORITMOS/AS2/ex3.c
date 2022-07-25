/*Fazer um algorítimo que seja lido uma palavra e imprima:
A quantidade de vogais que compõe a palavra.
A quantidade de letras dessa palavra.*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

int main(){
    char palavra[15];
    int cont=0,numVogais=0;
    int i ;
    printf("Digite uma palavra:\n");
    scanf("%s",&palavra[i]);
    for (i = 0; i < palavra[i]; i++){
        cont++;
        if (palavra[i]=='a' || palavra[i]== 'A'||palavra[i]=='e' || palavra[i]== 'E' || palavra[i]=='i' || palavra[i]== 'I'||
        palavra[i]=='o' || palavra[i]== 'O' || palavra[i]=='u' || palavra[i]== 'U'){
            numVogais++;
        }
        
    }
    printf("A palavra %s tem %d vogais e %d letras\n",palavra,numVogais,cont);
    return 0;

}
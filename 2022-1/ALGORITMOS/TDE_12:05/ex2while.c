#include <stdio.h>

int main (){
    int i =1000;
    while(i <1500){
        if (i%2!=0){
            printf("Número impar:%d\n",i);
        }
        i++;
    }
}
#include <stdio.h>

int main(){
    int logica[5], programacao[3];
    for (int i = 0; i < 5; i++){
        printf("Digite o codigo da matricula do aluno de logica\n");
        scanf("%d%*c",&logica[i]);
    }
    for (int i = 0; i < 3; i++){
        printf("Digite o codigo da matricula do aluno de programacao\n");
        scanf("%d%*c",&programacao[i]);
    }
    for (int i = 0; i < 3; i++){
            if (programacao[i]== logica[i]){
           printf("Aluno nas duas turmas:%d\n",programacao[i],logica[i]);
        }
        
       
        
        
    }
    
    
    

}
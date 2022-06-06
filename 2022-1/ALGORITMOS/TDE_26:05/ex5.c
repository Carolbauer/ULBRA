int main() {

int num[10],par=0,cont=0;

for(int i=0;i<10;i++){
    printf("Informe um valor:");
    scanf("%d",&num[i]);
    printf("%d\n",num[i]);
}
for(int i=0;i<10;i++){
    if(num[i]%2==0){
    cont=cont+1;
    }
}
    printf("O total de números pares é:%d",cont);

    return 0;
}
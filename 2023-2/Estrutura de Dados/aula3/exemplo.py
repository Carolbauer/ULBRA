try:
    numero = int(input("digite um numero inteiro: "))
    if numero % 2 == 0:
        print("O numero é par!")
    else: 
        print("O numero e impar!")
except ValueError:
    print("Erro! Digite um numero valido")
else:
    print("Operação concluida com sucesso")
finally:
    print("Fim de execução")
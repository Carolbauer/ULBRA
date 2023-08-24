#Criar um algoritmo que recebe um número ou sequência de números, separados por virgula.
#Os números devem ser inteiros, e armazenados em uma lista.
#O algoritmo deve ter um menu:
#1- Adicionar números
#0 - Sair

def soma_pares(lista):
    soma = 0
    for numero in lista:
        if numero % 2 == 0:
            soma += numero
    return soma 
def adicionar_numero(lista):
    numero = int(input("Digite um número inteiro: "))
    lista.append(numero)
    print(f"Números válidos: {lista}")
    print(f"A soma dos números pares é: {soma_pares(lista)}")
def menu():
    print("1. adicionar um número na lista")
    print("2. sair do programa")
    opcao = int(input("Digite a opção desejada: "))
    return opcao
numeros = []
opcao = menu()
while opcao != 2:
    if opcao == 1:
        adicionar_numero(numeros)
    else:
        print("Opção inválida")
    opcao = menu()
print("Fim do programa")
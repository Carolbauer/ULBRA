#Com base nos exemplos anteriores, crie um algoritmo usando uma lista, que simule a implementação de uma estrutura DEQUE, 
#que seja capaz de realizar as seguintes opções de MENU:1- Adicionar no Início
#2- Adicionar no final
#3- Exibir Primeiro
#4- Exibir Último
#5- Remover Primeiro
#6- Remover Último
#0- Sair 

from collections import deque
#inicializando o deque com uma lista vazia
deque = deque()
def menu():
    print("1- Adicionar no Início")
    print("2- Adicionar no final")
    print("3- Exibir Primeiro")
    print("4- Exibir Último")
    print("5- Remover Primeiro")
    print("6- Remover Último")
    print("0- Sair")

    opcao = int(input("Digite a opção desejada: "))

    return opcao

#defininfo as funções para as operações
def adicionar_inicio():
    elemento = input("Digite o elemento a ser adicionado ao início: ")
    deque.appendleft(elemento)
    print("Elemento adicionado com sucesso!")

def adicionar_final():
    elemento = input("Digite o elemento a ser adicionado ao final: ")
    deque.append(elemento)
    print("Elemento adicionado com sucesso!")

def exibir_primeiro():
    if len(deque) > 0:
        print("O primeiro elemento é: ", deque[0])
    else:
        print("Deque vazio!")

def exibir_ultimo():
    if len(deque) > 0:
        print("O último elemento é: ", deque[-1])
    else:
        print("Deque vazio!")

def remover_primeiro():
    if len(deque) > 0:
        print("Elemento removido: ", deque.popleft())
    else:
        print("Deque vazio!")

def remover_ultimo():
    if len(deque) > 0:
        print("Elemento removido: ", deque.pop())
    else:
        print("Deque vazio!")


opcao = menu()

while opcao != 0:
    if opcao == 1:
        adicionar_inicio()
    elif opcao == 2:
        adicionar_final()
    elif opcao == 3:
        exibir_primeiro()
    elif opcao == 4:
        exibir_ultimo()
    elif opcao == 5:
        remover_primeiro()
    elif opcao == 6:
        remover_ultimo()
    else:
        print("Opção inválida!")

    opcao = menu()

print("Fim do programa!")
#Criar um algoritmo que gerencie uma fila com as seguintes funções:
#enfileirar, desenfileirar, exibir primeiro, exibir ultimo , sair, exibir fila

def menu():
    print(
"""
1- ENFILEIRAR #ENQUEUE
2- DESENFILEIRAR #DEQUEUE
3- EXIBIR PRIMEIRO #FIRST
4- EXIBIR FILA
5- ENFILEIRAR PRIORITÁRIO
6- DESENFILEIRAR PRIORITÁRIO
7- EXIBIR PRIMEIRO PRIORITÁRIO
8- EXIBIR FILA PRIORITÁRIO
9- CHAMAR PRÓXIMO
10-EXIBIR HSTÓRICO
0- SAIR
""")

def enfileirar(lista, valor):
    lista.append(valor)

def desenfileirar(lista):
    if not lista:
        print("A lista está vazia!")
    else:
        valor = lista[0]
        enfileirar(historico, valor)
        lista.pop(0)
        
def exibir_primeiro(lista):
    if not lista:
        print("A lista está vazia!")
    else:
        print(f"O Primeiro elemento da lista é: {lista[0]}")

def exibir_fila(lista):
    if not lista:
        print("A lista está vazia!")
    else:
        for i in lista:
            print(i)

def chamar_proximo():
    if contador_prioritarios < 3 and fila_prioritarios:
        print(f"Chamando próximo prioritário: {fila_prioritarios[0]}")
        desenfileirar(fila_prioritarios)
        contador_prioritarios += 1
    elif fila:
        print(f"Chamando próximo não prioritário: {fila[0]}")
        desenfileirar(fila)
        contador_prioritarios = 0
    else:
        print("Filas vazias.")


fila = ["Paulo", "Tiago", "André"]
fila_prioritarios = ["Manoel", "Caroline", "Rafaela", "Eduardo", "Lucas", "Gustavo"]
historico = []


contador_prioritarios = 0

while True:
    menu()
    opc = int(input("Escolha uma opção: "))

    if opc == 1:
        valor = input("Digite um nome para colocar na fila:")
        enfileirar(fila, valor)
    elif opc == 2:
        desenfileirar(fila)
    elif opc == 3:
        exibir_primeiro(fila)
    elif opc == 4:
        exibir_fila(fila)
    elif opc == 5:
        valor = input("Digite um nome para colocar na fila:")
        enfileirar(fila_prioritarios, valor)
    elif opc == 6:
        desenfileirar(fila_prioritarios)
    elif opc == 7:
        exibir_primeiro(fila_prioritarios)
    elif opc == 8:            
        exibir_fila(fila_prioritarios)
    elif opc == 9: # CHAMAR PRÓXIMO (CHAMAR 3 prioritários e um não prioritário, sempre nesta sequência)

        if contador_prioritarios < 3 and fila_prioritarios:
            print(f"Chamando próximo prioritário: {fila_prioritarios[0]}")
            desenfileirar(fila_prioritarios)
            contador_prioritarios += 1
        elif fila:
            print(f"Chamando próximo não prioritário: {fila[0]}")
            desenfileirar(fila)
            contador_prioritarios = 0
        else:
            print("Filas vazias.")

    elif opc == 10:
        exibir_fila(historico)
    elif opc == 0:
        break
    else:
        print("Escolha uma opção válida!")
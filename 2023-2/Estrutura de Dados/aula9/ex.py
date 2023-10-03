import random
import time

def enfileirar (lista, valor):
    lista.append(valor)

def aleatorio(lista, valor):
    while len(lista) < valor:
        aleatorio = random.randint(1,100000)
        if aleatorio not in lista:
            enfileirar(lista, aleatorio)

def cronometro(algoritmo, lista):
    inicio = time.time()
    algoritmo(lista.copy())
    fim = time.time()
    tempo = fim - inicio
    print(f"Tempo de processamento: {tempo:.8f} segundos. ")


def selection_sort(lista):
    for i in range(len(lista)):
        for j in range(i + 1, len(lista)):
            if lista[j] < lista[i]:
                aux = lista[j]
                lista[j] = lista[i]
                lista[i] = aux
                
    return lista

def bubble_sort(lista):
    for i in range(len(lista)):
        for j in range(len(lista)-1, i,-1):
            if lista[j] < lista[j-1]:
                aux = lista[j]
                lista[j] = lista[j-1]
                lista[j-1] = aux
    return lista

def insertion_sort(lista):
    for i in range(1, len(lista)):
        chave = lista[i]
        j = i - 1
        while j >= 0 and chave < lista[j]:
            lista[j + 1] = lista[j]
            j -= 1
        lista[j + 1] = chave

    
    return lista

def merge_sort(lista):
    if len(lista) > 1:
        meio = len(lista) // 2
        metade_esquerda = lista[:meio]
        metade_direita = lista[meio:]

        merge_sort(metade_esquerda)

        merge_sort(metade_direita)

        i = j = k = 0

        while i < len(metade_esquerda) and j < len(metade_direita):
            if metade_esquerda[i] < metade_direita[j]:
                lista[k] = metade_esquerda[i]
                i += 1
            else:
                lista[k] = metade_direita[j]
                j +=1
            k+= 1

        while i < len(metade_esquerda):
            lista[k] = metade_esquerda[i]
            i += 1
            k += 1

        while j < len(metade_direita):
            lista[k] = metade_direita[j]
            j += 1
            k += 1

def quick_sort2(lista):
    if len(lista) <= 1:
        return lista
    else:
        pivo = lista[0]
        menores = [x for x in lista[1:] if x <= pivo]
        maiores = [x for x in lista[1:] if x > pivo]
        ordenados = quick_sort(menores) + [pivo] + quick_sort(maiores)
        return ordenados

def quick_sort(lista):
    if len(lista) <= 1:
        return lista
    else:
        pivot = lista[0]
        menores = []
        maiores = []
        
        for x in lista[1:]:
            if x <= pivot:
                menores.append(x)
            else:
                maiores.append(x)
        
        menores_ordenados = quick_sort(menores)
        maiores_ordenados = quick_sort(maiores)
        
        ordenados = menores_ordenados + [pivot] + maiores_ordenados
        return ordenados




lista_original = []

while True:
    print("""MENU:\n 1- Digitar número\n 2- Criar lista aleatória\n 3- Imprimir lista\n 4- Selection Sort\n 5- Bubble Sort\n 6- Insertion Sort\n 7- Merge Sort\n 8- Quick Sort\n 9-Limpar Lista\n 0- SAIR""")
    opc = int(input("Escolha uma opção:"))

    if opc == 0:
        break
    elif opc == 1:
        num = int(input("Digite um valor para Enfileirar: "))
        enfileirar(lista_original, num)
    elif opc == 2:
        valores = int(input("Escolha quantos elementos na lista:"))
        aleatorio(lista_original, valores)

    elif opc == 3:
        print(lista_original)
    
    elif opc == 4:
        cronometro(selection_sort, lista_original)
    elif opc == 5:
        cronometro(bubble_sort, lista_original)
    elif opc == 6:
        cronometro(insertion_sort, lista_original)
    elif opc == 7:
        cronometro(merge_sort, lista_original)
    elif opc == 8:
        cronometro(quick_sort, lista_original)
    elif opc == 9:
        lista_original.clear()

    else:
        print("Escolha um valor no menu")
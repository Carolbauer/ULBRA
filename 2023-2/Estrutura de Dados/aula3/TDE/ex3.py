def encontrar_maximo_minimo(lista):
    maximo = lista[0]
    minimo = lista[0]

    for num in lista:
        if num > maximo:
            maximo = num
        if num < minimo:
            minimo = num

    return maximo, minimo

def obter_lista():
    entrada = input("Digite números inteiros separados por espaço: ")
    numeros = entrada.split(" ")

    for num in numeros:
        try:
            numeros.append(int(item))
        except ValueError:
            print(f"Valor inválido: {item}. Ignorando este valor.")
    return numeros
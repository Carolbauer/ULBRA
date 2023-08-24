#Faça um algoritmo que receba em uma lista uma sequência de números separados por
#“vírgula” e após a sua digitação imprima no terminal a soma de todos os números pares
#presentes na lista. Utilize uma função para realizar a soma dos números (soma_pares()).
def soma_pares(lista):
    soma = 0
    for numero in lista:
        if numero % 2 == 0:
            soma += numero
    return soma

entrada = input("Digite números inteiros separados por vírgula: ").split(",")

numeros = []
for item in entrada:
    try:
        numeros.append(int(item))
    except ValueError:
        print(f"Valor inválido: {item}. Ignorando este valor.")
print(f"Números válidos: {numeros}")
print(f"A soma dos números pares é: {soma_pares(numeros)}")


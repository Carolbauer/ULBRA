numeros_validos = []
entrada = input("Digite números inteiros separados por espaços: ").split()
for item in entrada:
    try:
        numero = float (item)
        numeros_validos.append(numero)
    except ValueError:
        print(f"Valor inválido: (item). Ignorando este valor.")
    print(f"Os valores válidos digitados foram: {numeros_validos}")

    soma = 0
    for numero in numeros_validos:
        soma += numero
    print(f"A soma dos valores válidos é: {soma}")
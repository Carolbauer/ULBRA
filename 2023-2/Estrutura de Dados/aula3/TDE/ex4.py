def conta_vogais(texto):
    vogais = 'aeiouAEIOU'
    contador = 0

    for char in texto:
        if char in vogais:
            contador += 1

    return contador

texto = input("Digite um texto: ")
numero_vogais = conta_vogais(texto)

print(f"O texto possui {numero_vogais} vogais.")
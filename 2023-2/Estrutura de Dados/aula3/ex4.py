def dividir(a,b):
    quociente = a // b
    resto = a % b
    return quociente, resto

resultado_quociente, resultado_resto = dividir(10, 3)
print(resultado_quociente, resultado_resto)
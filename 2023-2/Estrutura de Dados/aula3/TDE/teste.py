def calculo_imc(peso, altura):
    imc = peso / (altura ** 2)
    return imc

def classificacao_imc(imc):
    if imc < 18.5:
        return "Abaixo do peso"
    elif imc < 25:
        return "Peso normal"
    elif imc < 30:
        return "Acima do peso (sobrepeso)"
    elif imc < 35:
        return "Obesidade I"
    elif imc < 40:
        return "Obesidade II"
    else:
        return "Obesidade III"
    
def valida_entrada(valor):
    while True:
        try:
            entrada = float(valor)
            return entrada
        except ValueError:
            print("Digite um valor adequado!/n" )
    
peso = valida_entrada(input("Digite o peso (em quilogramas): "))
altura = valida_entrada(input("Digite a altura (em metros): "))

imc = calculo_imc(peso, altura)
classificacao = classificacao_imc(imc)

print(f"IMC: {imc:.2f}")
print(f"Classificação: {classificacao}")
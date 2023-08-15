def saudacao(nome):
    print("Olá, " + nome + "! Bem vindo a aula sobre funções") 
    saudacao("João")

def calcular_media(nota1, nota2):
        media = (nota1 + nota2)/2
        return media
resultado = calcular_media(7.5, 8.2)
print("A média é:", resultado)
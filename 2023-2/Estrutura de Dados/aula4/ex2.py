lista = []

while True:
    print("MENU:\n 1-Adicionar valor\n 2- Remove ultimo\n 3-Limpa lista\n 0-Sair")
    opc = int(input("Digite a opção desejada: "))
    if opc == 1:
        entrada = input("Digite um número ou sequência de números, separados por virgula: ")
        entrada_tratada = entrada.split(",")
        for i in entrada_tratada:
            try:
                num = int(i)
                lista.append(num)
            except ValueError:
                print(f"Valor {i} invalido")
            print(lista)
        pass
    elif opc == 2:
        lista.pop()
        print(lista)
    elif opc == 3:
        lista.clear()
        print(lista)
    elif opc == 0: 
        break
    else:
        print("Opção inválida")

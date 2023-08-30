lista = []

while True:
    print("MENU:\n 1-Adicionar valor\n 2-Remove último\n 3-Limpa lista\n 0-Sair")
    opc = int(input("Digite a opção desejada: "))
    if opc == 1:
        entrada = input("Digite um número ou sequência de números, separados por vírgula: ")
        entrada_tratada = entrada.split(",")
        for i in entrada_tratada:
            try:
                num = int(i)
                lista.append(num)
            except ValueError:
                print(f"Valor {i} inválido")
        print(lista)
    elif opc == 2:
        if lista:
            lista.pop()
            print(lista)
        else:
            print("A lista está vazia.")
    elif opc == 3:
        lista.clear()
        print(lista)
    elif opc == 0:
        break
    else:
        print("Opção inválida")


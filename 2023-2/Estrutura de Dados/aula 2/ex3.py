lista = []

print(""" MENU DE OPÇÕES: \n 1 - PARA INSERIR\n 2 - REMOVER O ÚLTIMO\n 3 - PARA REMOVER O PRIMEIRO
      \n 4 - INSERIR NO INÍCIO\n 5 - IMPRIMIR A LISTA\n 6 - IMPRIMIR ÚLTIMO\n 0 - PARA SAIR""")

while True:
    opc = int(input("Digite a opção:"))

    if opc == 0:
        break

    elif opc == 1:
        num = int(input("Digite o valor:"))
        lista.append(num)
    
    elif opc == 2:
        lista.pop()

    elif opc == 3:
        lista.pop(0)

    elif opc == 4:
        lista.insert(0,num)

    elif opc == 5:
        print(lista)
    elif opc == 6:
        print(lista[-1])
    elif opc == 7:
        for item in lista:
            if item  % 2 == 1:
                lista.remove(item)

    else:
        print("Digite uma opção válida")



print(lista)
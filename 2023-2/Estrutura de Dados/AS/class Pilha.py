class Fila:
    def __init__(self):
        self.itens = []

    def vazia(self):
        return len(self.itens) == 0

    def tamanho(self):
        return len(self.itens)

    def enfileirar(self, item):
        self.itens.append(item)

    def desenfileirar(self):
        if not self.vazia():
            return self.itens.pop(0)
        else:
            return None
    def listar_nomes(self):
        if not self.vazia():
            return self.itens
        else:
            return None


def menu_fila(fila):
    while True:
        print("Menu da Fila:\n 1-Adicionar\n 2-Remover\n 3-Imprimir fila\n 4- chamar o próximo da fila\n 5-Sair")
        opc = int(input("Digite a opção: "))

        if opc == 1:
            item = input("Digite o item: ")
            fila.enfileirar(item)
            print("Nome adicionado com sucesso!")
        elif opc == 2:
            item_desenfileirado = fila.desenfileirar()
            if item_desenfileirado is not None:
                print("Nome removido com sucesso:", item_desenfileirado)
            else:
                print("A fila está vazia!")
        elif opc == 3:
            print("Nomes na fila:", fila.tamanho())
            print(fila.listar_nomes())
        elif opc == 4:
            if not fila.vazia():
                print("Próximo da fila:", fila.itens[0])
            else:
                print("A fila está vazia!")
        elif opc == 5:
            print("Saindo...")
            break
        else:
            print("Opção inválida!")



fila = Fila()
menu_fila(fila)

import mysql.connector

class database:
    def __init__(self, db_config):
        self.db_config = db_config

    # Função para criar o banco de dados
    def create_database(self):
        conn = mysql.connector.connect(**db_config)
        cursor = conn.cursor()

        cursor.execute('''
            CREATE TABLE IF NOT EXISTS myDatabase (
                id INT PRIMARY KEY AUTO_INCREMENT,
                nome VARCHAR(60),
                perfil_linkedin VARCHAR(100)
            );
        ''')

        conn.commit()
        conn.close()
    
    

    #Função para Adicionar Contatos
    def insert_contacts(self, name, perfil_linkedin):
        conn = mysql.connector.connect(**db_config)
        cursor = conn.cursor()
        
        try:
            cursor.execute('SELECT * FROM myDatabase WHERE perfil_linkedin = %s', (perfil_linkedin,))
            if cursor.fetchone() is None:
                cursor.execute('INSERT INTO myDatabase (nome, perfil_linkedin) VALUES (%s, %s)', (name, perfil_linkedin))
                conn.commit()
            else:
                print("Esse contato já foi cadastrado.")
        except mysql.connector.Error as erro:
            print(f"Ocorreu um erro {erro}. Tente novamente.")

        conn.close()
    
    # Função para listar contatos
    def list_contacts(self):
        conn = mysql.connector.connect(**db_config)
        cursor = conn.cursor()

        cursor.execute('SELECT * FROM myDatabase')
        contacts = cursor.fetchall()

        conn.close()
        return contacts

    # Função para excluir contato
    def delete_contacts(self, id):
        conn = mysql.connector.connect(**db_config)
        cursor = conn.cursor()
        cursor.execute('DELETE FROM mydatabase WHERE id = %s', (id,))

        conn.commit()
        conn.close()
        
    def menu(self):
        while True:
            print("""MENU:
    1- Adicionar um contato
    2- Listar os contatos
    3- Excluir um contato
    0- SAIR""")
            opc = int(input("Digite uma opção: "))
            if opc == 1:
                name = input("Nome do contato: ")
                perfil_linkedin = input("Perfil do LinkedIn: ")
                self.insert_contacts(name, perfil_linkedin)
            elif opc == 2:
                contacts = self.list_contacts()
                if contacts:
                    print("Lista de contatos:")
                    for contato in contacts:
                        print(f"ID: {contato[0]}, Nome: {contato[1]}, Perfil LinkedIn: {contato[2]}")
                else:
                    print("Não há contatos.")
            elif opc == 3:
                id = input("Informe o ID do contato que deseja excluir: ")
                self.delete_contacts(id)
            elif opc == 0:
                print("Encerrando...")
                break    
            else:
                print("Digite uma opção válida!")        
        
if __name__ == "__main__":
    db_config = {
        'user':'natanhmc',
        'password':'1q2w3e4r5t',
        'host':'db4free.net',
        'database':'linkedin123',
        'port':3306
    }
    
    meu_banco = database (db_config)
    meu_banco.create_database()
    meu_banco.menu()
    
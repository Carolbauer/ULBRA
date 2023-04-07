/*Escreva uma SP que receba, como parâmetro,
  o CPF de um autor e retorne a quantidade de livros escrito pelo mesmo.
 */
delimiter $$
create procedure QuantidadelivrosAutor(
@cpf varchar(11)
)

/*begin= indica da onde começar a sequencia de comandos
 */
 AS
    BEGIN
        select count((*) AS Quantidadelivros
        from livros
        where cpf_autor = @cpf
        END $$
        delimiter;

/*Crie uma SP que receba, como parâmetro, a data de publicação de um livro e seu código.
  O procedimento deve atualizar a tabela de livros, especificando a data de lançamento para
  o livro em questão.
 */
DELIMITER $$
    CREATE PROCEDURE AtualizarData(
    @codigo int,
    @nova_data_publicacao date
    )

    AS
        BEGIN
            UPDATE Livros
            SET Datapublicacao = @nova_data_publicacao
            where CodigoLivro = @codigo /* especificar qual registro deve ser atualizado*/
            END $$
            DELIMITER;
/*Em algumas situações, SPs são utilizados para a manutenção da segurança do banco de dados. Nestes casos, realizamos inclusões, alterações e exclusões de dados, através de SPs. Crie SPs que recebem os parâmetros adequados e realizam as seguintes operações:

a) Inserir uma linha na tabela de livros
*/
DELIMITER $$
            CREATE PROCEDURE (AdicionarLivro
            @titulo varchar(100),
            @autor varchar(100),
            @editora varchar(100)
            )
            AS
            BEGIN
                INSERT INTO Livros(Titulo,Autor, Editora)
                VALUES (@titulo, @autor,@editora)
            END $$
            DELIMITER;

/*b) Excluir uma linha da tabela de livros*/
        DELIMITER $$
            CREATE PROCEDURE deletarLinha(
            @codigo int
            )
            AS
            BEGIN
            DELETE FROM Livros
            WHERE codigoLivro = @codigo
            END $$
            DELIMITER;

/*
c) Atualizar valores na tabela de livros
 */

 DELIMITER
    CREATE PROCEDURE AtualizarLivro
    @codigo INT,
    @titulo VARCHAR(100),
    @autor VARCHAR(100),
    @genero VARCHAR(50),
    @data_publicacao DATE,
    @editora VARCHAR(100)
AS
BEGIN
    UPDATE Livros
    SET Titulo = @titulo, Autor = @autor, Genero = @genero, DataPublicacao = @data_publicacao, Editora = @editora
    WHERE CodigoLivro = @codigo
END $$
DELIMITER;


/*
Crie uma SP que aumente ou diminua o valor dos preços dos livros de uma editora específica. O aumento pode ser em percentual ou em valor.
*/
  DELIMITER
   CREATE PROCEDURE ajustes_precos(
    @editora VARCHAR(100),
    @percentual FLOAT = NULL,
    @valor FLOAT = NULL,
    @aumentar BIT = 1
   )
        AS
BEGIN
    DECLARE @alteracao FLOAT

    IF @aumentar = 1
    BEGIN
        IF @percentual IS NOT NULL
            SET @alteracao = 1 + (@percentual / 100)
        ELSE IF @valor IS NOT NULL
            SET @alteracao = 1 + (@valor / (SELECT AVG(Preco) FROM Livros WHERE Editora = @editora))
    END
    ELSE
    BEGIN
        IF @percentual IS NOT NULL
            SET @alteracao = 1 - (@percentual / 100)
        ELSE IF @valor IS NOT NULL
            SET @alteracao = 1 - (@valor / (SELECT AVG(Preco) FROM Livros WHERE Editora = @editora))
            END

    UPDATE Livros
    SET Preco = Preco * @alteracao
    WHERE Editora = @editora
END $$
DELIMITER;

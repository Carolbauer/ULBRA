use Pessoas;
/*Crie uma tabela Pessoas que contenha as colunas id, nome, sexo e data_nascimento.*/
CREATE TABLE Pessoas(
    Id int primary key not null auto_increment,
    nome varchar(50) not null,
    sexo varchar(10),
    data_nascimento date not null

);

/*Crie uma Store Procedure onde sejam possíveis passar como parâmetro as informações para Nome,
  Sexo e Data_Nascimento. Esta Stored Procedure deverá consultar no banco de dados o último
  ID gerado na tabela de Pessoas,incrementar este ID e inserir um registro nesta tabela
  com os dados enviados por parâmetro.*/

DELIMITER $$
  CREATE PROCEDURE inserir_pessoas(
  IN nome VARCHAR(50),
  IN sexo VARCHAR(10),
  IN data_nascimento  DATE
  )
BEGIN
    DECLARE p_id int; #declarando uma variavel para armazenar temporariamente o valor do id max da tabela pessoas

    SELECT MAX(Id) INTO p_id FROM  Pessoas; #selecionando o ultimo id
    SET p_id = p_id + 1;#incrementando o valor da variavel,garantindo que o novo id seja maior que o id maximo existente

    #inserindo novo registro na tabela pessoas
    INSERT INTO Pessoas(id, nome, sexo, data_nascimento)
        values (p_id, p_nome, p_sexo, p_data_nascimento);
END $$
DELIMITER ;

/*Crie uma Stored Procedure que mostre quantos Homens e quantas Mulheres têm cadastrados.*/

DELIMITER $$
CREATE PROCEDURE Qtd_sexos()
BEGIN
    SELECT
        #selecionando a taveka sexo e criando uma tabela com a quantidade após soma
        SUM (CASE WHEN sexo = 'MASCULINO' THEN 1 ELSE 0 END) AS qtd_homens,
        SUM(CASE WHEN sexo = 'FEMININO' THEN 1 ELSE 0 END) AS qtd_mulheres
        FROM Pessoas;
END $$
DELIMITER ;

/*Crie uma Stored Procedure que mostre quantos Homens
  são menores e maiores de idade, e quantas Mulheres são maiores e menores de idade.
 */

 DELIMITER $$
CREATE PROCEDURE qtd_homens_mulheres_maior_menor_idade()
BEGIN
  SELECT
    sexo,
    #verificar se a pessoa eé maior ou menor de idade
    CASE WHEN TIMESTAMPDIFF(YEAR, data_nascimento, CURDATE()) < 18 THEN 'Menor de idade' ELSE 'Maior de idade' END AS faixa_etaria,
    COUNT(*) AS quantidade #contar a quantidade de pessoas em cada grupo
  FROM
    Pessoas
  GROUP BY #agrupar resultado por sexo e faixa etaria
    sexo, faixa_etaria;

END $$
DELIMITER ;

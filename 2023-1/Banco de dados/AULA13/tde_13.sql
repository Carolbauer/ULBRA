use TDE_13;

CREATE TABLE Produto (
    ID INT PRIMARY KEY auto_increment not null,
    Nome VARCHAR(255)
);

CREATE TABLE Ingrediente (
    ID INT PRIMARY KEY auto_increment not null,
    Nome VARCHAR(255)
);

CREATE TABLE Lote (
    ID INT PRIMARY KEY auto_increment not null,
    DataProducao DATE,
    QuantidadeProduzida INT,
    produto_id int not null,
    constraint fk_Produto_Lote
    foreign key (produto_id) references Produto(ID)

);

CREATE TABLE Receita (
    ID int primary key auto_increment not null ,
    Produto_ID INT not null,
    constraint fk_Produto_Composicao
    FOREIGN KEY (Produto_ID) REFERENCES Produto(ID)
                     ON DELETE RESTRICT
                     ON UPDATE CASCADE

);

CREATE TABLE Ingrediente_Receita (
    Receita_ID INT,
    Ingrediente_ID INT,
    QuantidadeUtilizada DECIMAL(10, 2),
    constraint fk_Receita_Ingrediente_Receita
    FOREIGN KEY (Receita_ID) REFERENCES Receita(ID)
                    ON DELETE RESTRICT
                    ON UPDATE CASCADE,
    constraint fk_Ingrediente_Composicao
        FOREIGN KEY (Ingrediente_ID) REFERENCES Ingrediente(ID)
                    ON DELETE RESTRICT
                    ON UPDATE CASCADE
);

CREATE TABLE Categoria (
    NomeCategoria VARCHAR(255)not null,
    Produto_ID INT not null,
    constraint fk_Produto_Categoria
    FOREIGN KEY (Produto_ID) REFERENCES Produto(ID)
                    ON DELETE RESTRICT
                    ON UPDATE CASCADE
);

CREATE TABLE Estoque (
    QuantidadeEstoque DECIMAL(10, 2) not null,
    Ingrediente_ID INT not null,
    constraint fk_Ingrediente_Estoque
    FOREIGN KEY (Ingrediente_ID) REFERENCES Ingrediente(ID)
                     ON DELETE RESTRICT
                     ON UPDATE CASCADE
);

CREATE TABLE Disponibilidade (
    QuantidadeDisponivel INT not null,
    Produto_ID INT not null,
    Lote_ID INT not null,
    constraint fk_Produto_Disponibilidade
    FOREIGN KEY (Produto_ID) REFERENCES Produto(ID)
                    ON DELETE RESTRICT
                    ON UPDATE CASCADE,
    constraint fk_Lote_Disponibilidade
    FOREIGN KEY (Lote_ID) REFERENCES Lote(ID)
                    ON DELETE RESTRICT
                    ON UPDATE CASCADE
);

ALTER TABLE Produto ADD COLUMN data_validade DATE not null ;

INSERT INTO Produto (Nome,data_validade) VALUES
('Produto A','2023-06-15'),
('Produto B','2023-10-30'),
('Produto C', '2023-05-28'),
('Produto D', '2023-06-28');

INSERT INTO Ingrediente (Nome) VALUES
('Ingrediente A'),
('Ingrediente B'),
('Ingrediente C');

INSERT INTO Lote (DataProducao, QuantidadeProduzida,produto_id) VALUES
('2023-04-05', 2,3),
('2023-04-16', 1,1),
('2023-05-02', 50,2),
('2023-05-03', 75,3);

select *
from Lote;

INSERT INTO Receita (Produto_ID) VALUES
(1),
(2),
(3);

INSERT INTO Ingrediente_Receita (Receita_ID, Ingrediente_ID, QuantidadeUtilizada) VALUES
(1, 1, 10.5),
(1, 2, 5),
(1, 3, 7),
(2, 2, 6),
(2, 3, 8),
(3, 1, 12),
(3, 3, 10);

INSERT INTO Categoria (NomeCategoria, Produto_ID) VALUES
('Categoria A', 1),
('Categoria B', 2),
('Categoria C', 3),
('Categoria A', 4);

INSERT INTO Estoque (QuantidadeEstoque, Ingrediente_ID) VALUES
(100, 1),
(200, 2),
(150, 3);

INSERT INTO Disponibilidade (QuantidadeDisponivel, Produto_ID, Lote_ID) VALUES
(50, 1, 1),
(25, 2, 2),
(30, 3, 3);
-- Exibir quantos produtos há para cada categoria;

SELECT c.NomeCategoria, COUNT(p.ID) AS QuantidadeProdutos
FROM Categoria c
JOIN Produto p ON c.Produto_ID = p.ID
GROUP BY c.NomeCategoria;

-- Exibir todos os produtos, quais ingredientes e em que quantidade são  utilizados para produzi-lo;

SELECT P.Nome, I.Nome,IR.QuantidadeUtilizada
FROM Produto P
    INNER JOIN Receita R on P.ID = R.Produto_ID
    INNER JOIN Ingrediente_Receita IR on R.ID = IR.Receita_ID
    INNER JOIN Ingrediente I on IR.Ingrediente_ID = I.ID;

-- Exibir qual a quantidade produzida de cada produto dos últimos 30 dias;
SELECT P.Nome, SUM(L.QuantidadeProduzida) AS quantidadeProduzida_30dias
    FROM Produto P
    INNER JOIN Lote L on P.ID = L.produto_id
    WHERE L.DataProducao >= CURDATE() - INTERVAL 30 DAY
    GROUP BY P.Nome;

-- Se for dobrada a produção para o próximo mês, quanto de ingrediente será  necessário.
SELECT I.Nome, SUM(IR.QuantidadeUtilizada * 2) AS QuantidadeNecessaria
    FROM Produto P
    INNER JOIN Receita R on P.ID = R.Produto_ID
    INNER JOIN Ingrediente_Receita IR on R.ID = IR.Receita_ID
    INNER JOIN Ingrediente I on IR.Ingrediente_ID = I.ID
   group by I.Nome;

-- Mostrar os ingredientes que nunca foram utilizados;
SELECT I.Nome
FROM Ingrediente I
    WHERE NOT EXISTS(
        SELECT *
        FROM Ingrediente_Receita IR
        WHERE IR.Ingrediente_ID = I.ID
        );

/*Crie uma trigger para garantir o controle de estoque dos produtos fabricados. Quanto um produto for
 fabricado deve dar saída dos estoque dos ingredientes utilizados.
  Caso ocorra o estorno da fabricação, manter o estoque dos ingredientes atualizado também;
 */
DELIMITER $$
CREATE TRIGGER trg_ControleEstoque_AfterInsert
AFTER INSERT ON Lote
FOR EACH ROW
BEGIN
    -- Verifica se é uma inserção de fabricação de produto
    IF NEW.Produto_ID IS NOT NULL THEN
        -- Reduz a quantidade dos ingredientes utilizados
        UPDATE Estoque
        SET QuantidadeEstoque = QuantidadeEstoque - (
            SELECT IR.QuantidadeUtilizada * NEW.QuantidadeProduzida
            FROM Receita R
            INNER JOIN Ingrediente_Receita IR ON R.ID = IR.Receita_ID
            WHERE R.Produto_ID = NEW.Produto_ID
                AND IR.Ingrediente_ID = Estoque.Ingrediente_ID
        )
        WHERE Ingrediente_ID IN (
            SELECT IR.Ingrediente_ID
            FROM Receita R
            INNER JOIN Ingrediente_Receita IR ON R.ID = IR.Receita_ID
            WHERE R.Produto_ID = NEW.Produto_ID
        );
    END IF;
END$$
delimiter ;
    -- Utilizando controle de transações, atualize as receitas para reduzir em 10% a  quantidade de fermento utilizada;
START TRANSACTION;
UPDATE Ingrediente_Receita
SET QuantidadeUtilizada = QuantidadeUtilizada * 0.9
WHERE Ingrediente_ID IN (
    SELECT ID
    FROM Ingrediente
    WHERE Nome = 'Ingrediente B'
);

COMMIT;
select *
    from Ingrediente_Receita;
 -- Utilizando controle de transações, exclua todos os registros de produção do  último mês;
START TRANSACTION;

-- Excluir os registros de produção do último mês
START TRANSACTION;
DELETE FROM Disponibilidade WHERE Lote_ID IN (
  SELECT ID FROM Lote WHERE DataProducao >= DATE_SUB(CURDATE(), INTERVAL 1 MONTH)
);
DELETE FROM Lote WHERE DataProducao >= DATE_SUB(CURDATE(), INTERVAL 1 MONTH);
ROLLBACK ;

SELECT *
FROM Lote;


START TRANSACTION;

DELETE FROM Lote
WHERE MONTH(DataProducao) = MONTH(DATE_SUB(NOW(), INTERVAL 1 MONTH))
AND YEAR(DataProducao) = YEAR(DATE_SUB(NOW(), INTERVAL 1 MONTH));
ROLLBACK ;


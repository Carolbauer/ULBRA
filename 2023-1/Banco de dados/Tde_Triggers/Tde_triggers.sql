use TDE_Triggers;

CREATE table Produtos(
codigo int primary key auto_increment not null ,
prd_descricao varchar(100) not null ,
prd_valor double not null,
prd_status varchar(20),
prd_falta varchar(20) not null,
prd_qtd_estoque int not null
);

create table Orcamentos(
    codigo int primary key not null auto_increment,
    orc_data date,
    orc_status varchar(20) not null
);

create table Orcamentos_produtos(
    orp_valor double not null,
    orp_qtd int not null,
    orp_status varchar(20) not null,
    prd_codigo int not null ,
    orc_codigo int not null,
    constraint Produtos_Orcamentos_produtos_fk
            foreign key (prd_codigo) references Produtos(codigo)
                                on delete restrict
                                on update cascade,

    constraint Orcamentos_Orcamentos_PRODUTOS_FK
            FOREIGN KEY (orc_codigo) references Orcamentos(codigo)
                                on delete restrict
                                on update cascade


);

-- Inserir alguns produtos
INSERT INTO Produtos (prd_descricao, prd_valor, prd_status, prd_falta, prd_qtd_estoque)
VALUES ('Produto 1', 10.5, 'Disponível', 'Não', 100),
       ('Produto 2', 15.99, 'indisponível', 'Sim', 75),
       ('Produto 3', 15.99, 'Disponível', 'Sim', 75),
       ('Produto 4', 25.5, 'Disponível', 'Não', 30),
       ('Produto 5', 8.75, 'Disponível', 'Não', 200);
SELECT *
FROM Produtos;

-- Inserir um orçamento
INSERT INTO Orcamentos (orc_data, orc_status)
VALUES ('2023-05-01', 'Finalizado'),
       ('2023-05-02', 'Em aberto'),
       ('2023-05-03', 'Em aberto')
       ;
SELECT *
FROM Orcamentos;
-- Inserir os produtos do orçamento
INSERT INTO Orcamentos_produtos (orp_valor, orp_qtd,orp_status, prd_codigo, orc_codigo)
VALUES (10.5,1, 'incluido', 1, 1),
        (20.0,4, 'não incluido', 2, 1),
        (20.0, 2,'Incluído', 2, 2),
        (15.99,3, 'Incluído', 3, 3),
        (8.75, 5,'Incluído', 5, 3);
SELECT *
FROM Orcamentos_produtos;

DELIMITER $$
CREATE TRIGGER inserir_produto_orcamento AFTER INSERT ON Orcamentos_produtos
	FOR EACH ROW
BEGIN
	UPDATE Produtos SET prd_qtd_estoque =prd_qtd_estoque - NEW.orp_qtd
	WHERE Produtos.codigo=NEW.prd_codigo;
END $$
DELIMITER $$

INSERT INTO Orcamentos_produtos (orp_valor,orp_qtd, orp_status, prd_codigo, orc_codigo)
VALUES (10.5,2, 'Incluído', 1, 1);

SELECT * FROM Produtos;

SELECT prd_qtd_estoque
FROM Produtos
WHERE codigo = 1;


DELIMITER $$
CREATE TRIGGER deleta_produto_orcamento AFTER DELETE ON Orcamentos_produtos
	FOR EACH ROW
BEGIN
	UPDATE Produtos
	SET prd_qtd_estoque =prd_qtd_estoque + OLD.orp_qtd
	WHERE Produtos.codigo=OLD.prd_codigo;
END $$
DELIMITER $$
 SELECT* FROM Orcamentos_produtos;

DELETE FROM Orcamentos_produtos WHERE orp_status = 'não incluido';

DELETE FROM Orcamentos_produtos WHERE prd_codigo = 1;
SELECT * FROM Produtos;

CREATE TABLE Produtos_atualizados (
  prd_codigo INT NOT NULL,
  prd_qtd_anterior INT NOT NULL,
  prd_qtd_atualizada INT NOT NULL,
  prd_valor DOUBLE NOT NULL,
  constraint Produtos_atualizados_produtos_fk
            foreign key (prd_codigo) references Produtos(codigo)
                                on delete restrict
                                on update cascade
);

CREATE TABLE produtos_em_falta (
  prd_codigo INT NOT NULL,
  prd_descricao VARCHAR(100) NOT NULL,
  prd_falta VARCHAR(20) NOT NULL,
  prd_status varchar(20) ,
 constraint produtos_em_falta_produtos_fk
            foreign key (prd_codigo) references Produtos(codigo)
                                on delete restrict
                                on update cascade
);

DELIMITER $$
CREATE TRIGGER atualiza_produtos AFTER UPDATE ON Produtos
    FOR EACH ROW
BEGIN
    DECLARE qtd_anterior INT;
    SET qtd_anterior = OLD.prd_qtd_estoque;
    IF NEW.prd_qtd_estoque <> qtd_anterior THEN
        INSERT INTO Produtos_atualizados (prd_codigo, prd_qtd_anterior, prd_qtd_atualizada, prd_valor)
        VALUES (OLD.codigo, qtd_anterior, NEW.prd_qtd_estoque, OLD.prd_valor);

        IF NEW.prd_qtd_estoque = 0 THEN
            INSERT INTO produtos_em_falta (prd_codigo, prd_descricao, prd_status, prd_falta)
            VALUES (OLD.codigo, OLD.prd_descricao, NULL, 'Sim');

            UPDATE Produtos SET prd_status = NULL WHERE codigo = OLD.codigo;
            UPDATE Orcamentos_produtos SET orp_status = NULL WHERE prd_codigo = OLD.codigo;
        END IF;
    END IF;
END $$
DELIMITER $$

UPDATE Produtos SET prd_qtd_estoque = 20 WHERE codigo = 1;

select *from Produtos;

INSERT INTO Orcamentos_produtos (orp_valor,orc_codigo, orp_status,prd_codigo, orp_qtd)
VALUES (10.5,2,'Incluido', 1, 20);





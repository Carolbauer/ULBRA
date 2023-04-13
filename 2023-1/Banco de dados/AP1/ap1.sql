/*modelagem de uma Jazida*/
create table clientes(
	id int auto_increment primary key,
    nome varchar(100) not null,
    endereco varchar(100) not null,
    telefone varchar(11) not null
);

create table funcionarios(
	id int auto_increment primary key,
    nome varchar(100) not null,
    cargo varchar(50) not null,
    data_admissao date not null
);

create table maquinas(
	id int auto_increment primary key,
    modelo varchar(50) not null,
    id_func int not null,
    constraint funcionarios_maquinas_fk
    foreign key(id_func) references funcionarios(id)
		on delete restrict
        on update cascade
);

create table produtos(
	id int auto_increment primary key,
    descricao varchar(15) not null,
    preco_m3 decimal(10,2) not null
);

create table caminhoes(
	id int auto_increment primary key,
    placa varchar(7) not null,
    id_cliente int not null,
    constraint clientes_caminhoes_fk
    foreign key(id_cliente) references clientes(id)
		on delete restrict
        on update cascade
);

create table vendas(
	id int auto_increment primary key,
    data date not null,
    qnt_carga float not null,
    id_cliente int not null,
    id_caminhao int not null,
    id_prod int not null,
    id_maq int not null,
    constraint clientes_vendas_fk
    foreign key(id_cliente) references clientes(id),
    constraint caminhoes_vendas_fk
    foreign key(id_caminhao) references caminhoes(id),
    constraint produtos_vendas_fk
    foreign key(id_prod) references produtos(id),
    constraint maquinas_vendas_fk
    foreign key(id_maq) references maquinas(id)
		on delete restrict
        on update cascade
);

/* Populando as tabelas*/
insert into clientes(nome,endereco,telefone)
values('construsul', 'Arroio do Sal', '5199999999'),
	('construfacil', 'Rondinha', '51888888888'),
    ('construforte', 'Perola', '51777777777'),
    ('PedrãoMC', 'Arroio do sal', 51555555555);

insert into funcionarios(nome,cargo,data_admissao)
values('Tiago', 'Operador', '2013-09-13'),
	('Pedro', 'Operador', '2015-04-3'),
    ('Kiko', 'Operador', '2010-09-13');

insert into maquinas(modelo, id_func)
values('Hyundai ls220', 1),
      ('JCB 210', 2),
      ('xcmg 190', 3);

insert into produtos(descricao, preco_m3)
values ('Arenosa', 14.00),
       ('Argila', 12.00),
       ('Terra Orgânica', 18.00);

insert into caminhoes(placa, id_cliente)
values('abc0d00', 1), ('abc0d11', 1), ('abc0d22', 1),
('abc0d33', 2), ('abc0d44', 2), ('abc0d55', 3), ('abc0d66', 3);


insert into vendas(data, qnt_carga, id_prod, id_cliente, id_caminhao, id_maq)
values('2023-01-04', 12, 1, 1, 1, 1), ('2023-01-04', 12, 1, 1, 2, 1), ('2023-01-04', 10, 1, 1, 3, 1),
('2023-01-04', 12, 1, 2, 4, 1), ('2023-01-04', 12, 1, 2, 5, 1), ('2023-01-04', 10, 2, 1, 3, 2),
('2023-01-04', 12, 1, 3, 6, 1), ('2023-01-04', 12, 1, 2, 5, 1), ('2023-01-04', 12, 2, 1, 1, 2),
('2023-02-05', 12, 1, 1, 2, 1), ('2023-02-05', 12, 2, 2, 5, 2), ('2023-02-05', 12, 2, 1, 1, 2),
('2023-02-05', 12, 1, 3, 6, 1), ('2023-02-05', 12, 1, 2, 5, 1), ('2023-03-02', 10, 2, 1, 3, 2);

/*view de Quantidade de vendas realizadas por dia*/
CREATE VIEW vendas_por_dia AS
    SELECT v.data AS data_venda, count(*) AS quantidade_vendas #contando quantas vendas ocorreram por dia
        FROM vendas v
            GROUP BY data; #agrupando as vendas por data


/* View de Quantidade de caminhao por funcionariono mes de janeiro de 2023*/
CREATE VIEW caminhoes_por_funcionario AS
    SELECT v.data AS data_venda, f.nome as nome_funcionario, count(v.id_maq) AS quantidade_caminhoes_carregados #count conta quantas vezes o id_maq foi carregado por um funcionario naquele dia
        FROM maquinas m
            inner join vendas v on v.id_maq = m.id # junta tabela maquina com tabela vendas
            inner join funcionarios f on m.id_func = f.id #junta tabela maquina com a tabela funcionario
            where v.data >='2023-01-01' and v.data <= '2023-01-31' # pesquisando no mês de Janeiro
            GROUP BY f.nome; #agrupando caminhões carregados por nome do funcionário

CREATE VIEW caminhoes_por_funcionario2 AS
    SELECT v.data AS data_venda, f.nome as nome_funcionario, count(v.id_maq) AS quantidade_caminhoes_carregados
        FROM funcionarios f
            inner join maquinas m on f.id = m.id_func
            inner join vendas v on v.id_maq = m.id # junta tabela maquina com tabela vendas
            where v.data >='2023-01-01' and v.data <= '2023-01-31'
            GROUP BY f.nome; #agrupando caminhões carregados por nome do funcionário

/* View de Quantidade de produtos mais vendidos por cliente no mês de Janeiro de 2023*/
CREATE VIEW produtos_mais_vendidos_por_cliente AS
    SELECT c.nome AS nome_cliente, p.descricao AS descricao_produto, sum(v.qnt_carga) AS produtos_mais_vendidos #somando a quantidade de carga de produtos por cliente
        FROM produtos p
            INNER JOIN vendas v on p.id = v.id_prod #juntando a tabela produtos com vendas
            INNER JOIN clientes c on v.id_cliente = c.id #juntando a tabela clientes com vendas
            WHERE v.data >='2023-01-01' and v.data <= '2023-01-31' #filtrar vendas realizadas nesse período
            group by nome_cliente, descricao_produto #pesquisa agrupando pelo nome do cliente e descricao do produto
            ORDER BY produtos_mais_vendidos desc; # ordenando pela quantidade de produtos mais vendidos em ordem decrescente

/*prodecure para listar os produtos mais vendidos por cliente*/
DELIMITER $$
CREATE PROCEDURE listar_produtos_mais_vendidos_por_cliente(
    IN data_inicio DATE,
    IN data_fim DATE
    )
BEGIN
    SELECT c.nome AS nome_cliente, p.descricao AS descricao_produto, sum(v.qnt_carga) AS quantidade_produtos_vendidos
    FROM produtos p
    INNER JOIN vendas v ON p.id = v.id_prod
    INNER JOIN clientes c ON v.id_cliente = c.id
    WHERE v.data >= data_inicio AND v.data <= data_fim
    GROUP BY c.id, p.id
    ORDER BY  quantidade_produtos_vendidos DESC;
END $$ #Término procedure
DELIMITER ;
CALL listar_produtos_mais_vendidos_por_cliente('2023-01-01', '2023-01-31');#Chamar a stored procedure criada anteriormente passando os parametros


/*Procedure de clientes que não tiveram nenhuma compra em janeiro de 2023*/
DELIMITER $$
CREATE PROCEDURE listar_clientes_sem_compras_jan_2023(
    IN data_inicio DATE,
    IN data_fim DATE
)
BEGIN
    SELECT c.nome AS nome_cliente
        FROM clientes c
            LEFT JOIN vendas v on c.id = v.id_cliente AND v.data >= data_inicio AND v.data <= data_fim
    /*retorna todas as linhas da tabela cliente(pegando os clientes sem venda nesse período*/
        WHERE  v.id is null; #query retorna somente os clientes que não apresentam vendas no período
end $$
    DELIMITER ;
    CALL listar_clientes_sem_compras_jan_2023('2023-01-01', '2023-01-31');

/*procedure que consulta o ultimo id gerado e  insere novo cliente*/
DELIMITER $$
CREATE PROCEDURE inserir_clientes(
    IN nome VARCHAR(50),
    IN endereco VARCHAR (100),
    IN telefone VARCHAR(20)
)
BEGIN
    DECLARE c_id int; #declarando uma variavel para armazenar temporariamente o valor do id max da tabela clientes

    SELECT MAX(id) INTO c_id FROM clientes; #Selecionando o último id
    SET c_id = c_id +1; #incrementando o valor da variavel, garantindo que o novo id seja maior que o id maximo existente

    #inserindo novo registro na tabela clientes
    INSERT INTO clientes(id,nome,endereco,telefone)
        values (c_id,nome,endereco,telefone);
end $$
    DELIMITER ;
call inserir_clientes('tjdr','praia real', 88888888); #inserindo novo cliente

SELECT * FROM clientes;

/*procedure para Deletar um cliente*/
DELIMITER $$
CREATE PROCEDURE excluir_cliente(
    IN cliente_id int
)
BEGIN
        DELETE FROM clientes
        WHERE id = cliente_id;
END $$
DELIMITER ;
call excluir_cliente(5);

SELECT * FROM clientes;

/*procedure para listar clientes com endereco em Arroio do Sal*/
DELIMITER $$
CREATE PROCEDURE listar_clientes_arroio_do_sal()
BEGIN
    SELECT nome,endereco
    FROM clientes
    WHERE endereco LIKE '%Arroio do Sal%'; #filtra os registros que tem Arroio do sal no endereco

end $$
DELIMITER ;
CALL listar_clientes_arroio_do_sal(); #executar a procedure

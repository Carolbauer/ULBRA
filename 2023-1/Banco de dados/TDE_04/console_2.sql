use orcamentos;

create table Produtos(
     id int primary key auto_increment not null,
    nome varchar(50) not null,
    valor decimal(10,2) not null ,
    saldo_estoque int not null
);

create table Orcamentos(
    id int primary key auto_increment not null ,
    data date not null ,
    status enum ('em orcamento', 'vendido', 'cancelado')
);

create table Orcamentos_itens(
    valor_unit decimal(10,2) not null,
    quantidade int not null ,
    valor_total_itens decimal(10,2) not null,
    id_prod int not null,
    id_orc int not null,
    constraint Produtos_Orcamentos_itens_fk
        foreign key id_prod (id_prod)
                             references Produtos(id),
    constraint Orcamentos_Orcamentos_itens_fk
        foreign key id_orc (id_orc)
                             references Orcamentos (id)

);

INSERT INTO Produtos ( nome, valor, saldo_estoque)
VALUES ('computador DESKTOP', 1000.50, 0),
       ('Tv Smart', 5000.80, 5),
       ('Iphone', 10000.00, 20),
       ('computador NOTEBOOK ', 3500.00, 20),
       ('microondas', 300.30, 30);

INSERT INTO Orcamentos ( data, status)
VALUES ( '2023-03-01', 'em orcamento'),
       ( '2022-03-15', 'vendido'),
       ( '2014-09-05', 'vendido'),
       ( '2022-03-20', 'cancelado');


INSERT INTO Orcamentos_itens (id_prod, id_orc, valor_unit, quantidade, valor_total_itens)
VALUES (1, 1, 1000.50, 2, (valor_unit * quantidade)),
       (2, 1, 5000.00, 3, (valor_unit * quantidade)),
       (3, 1, 10000.00, 1, (valor_unit * quantidade)),
       (4, 2, 3500.00, 4, (valor_unit * quantidade)),
       (5, 2, 300.30, 2, (valor_unit * quantidade)),
       (1, 3, 1000.50, 1, (valor_unit * quantidade)),
       (2, 3, 5000.00, 2, (valor_unit * quantidade)),
       (3, 3, 10000.00, 3, (valor_unit * quantidade)),
       (4, 3, 3500.00, 2,(valor_unit * quantidade)),
       (5, 4, 300.30, 1, (valor_unit * quantidade));

select *
    from orcamentos_produtos;

select *
    from Produtos;


create view orcamentos_produtos AS
select P.nome AS nome_produto, oi.quantidade AS quantidade_produtos, oi.valor_unit AS valor_unidade, oi.valor_total_itens
AS valor_total_produtos, o.data AS periodo, P.saldo_estoque AS estoque, o.id AS id_orcamento
    from Orcamentos_itens oi
            inner join Orcamentos o on oi.id_orc=o.id
            right join Produtos P on oi.id_prod = P.id;

/*Lista de orçamentos por produto*/
select nome_produto, id_orcamento
    from orcamentos_produtos
order by nome_produto desc;

/*Valor total de produtos orçados por período*/
select nome_produto, valor_total_produtos, periodo
from orcamentos_produtos
where periodo >= '2022-03-01' and periodo <= '2022-03-31';

/*Produtos que tem “Computador” no nome e que tem quantidade em estoque.*/
select nome_produto, estoque
    from orcamentos_produtos
where nome_produto like 'computador%' and estoque > 0;

/*Os 10 produtos mais orçados no mês de setembro de 2014 e que ainda tem saldo em estoque.
  Somente os produtos com o valor acima de R$ 500.00.
 */
select nome_produto, periodo, valor_unidade,id_orcamento
from orcamentos_produtos
    where periodo >= '2014-09-01' and periodo <= '2014-09-30' and
      valor_unidade  > 500
    group by id_orcamento, nome_produto
    order by count(nome_produto)  desc

limit 10;

/*Faça uma consulta utilizando a view para
  acrescentar 20% nos produtos que o saldo em estoque é menor ou igual a 5.
 */
SELECT nome_produto, valor_unidade ,estoque, (valor_unidade * 1.2) AS valor_mais20
FROM orcamentos_produtos
WHERE estoque <= 5;

INSERT INTO Produtos ( nome, valor, saldo_estoque)
VALUES ('liquidificador', 99.60, 2);

/*DELETE FROM produtos WHERE produto_id = <id_do_produto> AND orcamento_id IS NULL;*/

/*Delete todos os produtos que não foram orçados.*/
DELETE
    from Produtos
WHERE not exists(SELECT 1 FROM Orcamentos_itens oi
                  INNER JOIN Orcamentos o ON oi.id_orc = o.id
                  WHERE oi.id_prod = Produtos.id);

/*Explique quando utilizar o GROUP BY, de um exemplo sql.*/
/*o group by é utilizado para agrupar dados de uma ou mais colunas*/
select nome_produto, id_orcamento, quantidade_produtos
    from orcamentos_produtos
        group by  id_orcamento, nome_produto

/*Explique quando utilizar o HAVING, de um exemplo sql.*/
/* having utilizado na condição do group by , filtrado apóa o agrupamento*/

select nome_produto, id_orcamento, valor_total_produtos
    from orcamentos_produtos
         group by nome_produto
            having valor_total_produtos > 1000;

/*Explique quando utilizar o UNION, de um exemplo sql.*/
/*utilizado para combinar dois selects de tabelas diferentes, similar ao join*/


/*Explique quando utilizar o LEFT JOIN, de um exemplo sql.*/
/*utilizado para unir 2 tabelas, exibindo todas as linhas da tabela a esquerda, mesmo que os valores sejam nulos*/

select P.nome AS nome_produto, oi.quantidade AS quantidade_produtos, oi.valor_unit AS valor_unidade, oi.valor_total_itens
AS valor_total_produtos, o.data AS periodo, P.saldo_estoque AS estoque, o.id AS id_orcamento
    from Orcamentos_itens oi
            inner join Produtos P on oi.id_prod = P.id
            left join Orcamentos o on oi.id_orc=o.id;



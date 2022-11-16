create table categorias(
    id int auto_increment primary key,
     nome varchar (100) not null
);

create table produtos(
id int primary key, 
descricao varchar(100) not null, 
data_cadastro date not null,
valor_unitario decimal(12,2) not null,
id_categorias int not null,
constraint fk_categorias_produtos
        foreign key(id_categorias) REFERENCES categorias(id)
        on delete restrict
        on update cascade
);

create table fornecedores(
    id int auto_increment primary key,
    nome  varchar(100) not null
);

create table pedidos(
    id int auto_increment primary key,
    data_pedido date not null,
     id_fornecedor int not null,
    constraint fk_fornecedores_pedido
        foreign key(id_fornecedor) REFERENCES fornecedores(id)
            on update cascade
            on delete restrict
);

create table pedidos_itens(
    quantidade decimal(8,3) not null, 
    valor_unitario decimal(12,2) not null, 
    id_pedido int not null,
    id_produto int not null,
    constraint pedidos_fk_pedidos_itens
        foreign key(id_pedido) REFERENCES pedidos(id)
            on delete restrict
            on update cascade
    constraint produtos_fk_pedidos_itens
        foreign key(id_produto) REFERENCES produtos(id)
            on delete restrict
            on update cascade
);

--1. Liste todos os produtos cadastrados e ordene por ordem alfabética de descrição.
--Populando as tabelas
insert into categorias(nome,id) VALUES('fruta',1);
insert into categorias(nome,id) VALUES('verdura',2);

SELECT nome,id
FROM categorias

insert into fornecedores(nome) VALUES('Tiago');
insert into fornecedores(nome) VALUES('Carol');

SELECT id,nome
FROM fornecedores

insert into pedidos(data_pedido,id_fornecedor) VALUES('2022/10/17',1);

SELECT data_pedido,id_fornecedor
FROM pedidos

insert into produtos(id,descricao,data_cadastro,valor_unitario,id_categorias) VALUES(2,'beterraba organica','2022/09/17',10,2);

SELECT id,descricao,data_cadastro,valor_unitario,id_categorias
FROM produtos

insert into pedidos_itens(quantidade,valor_unitario,id_pedido,id_produto) VALUES(10,10,1,2);

SELECT quantidade,valor_unitario,id_pedido,id_produto
FROM pedidos_itens

SELECT*
from produtos order by descricao

/* TABELAS
categorias
id  nome
1   frutas
2   verduras
3   Refrigerantes
4   cervejas

produtos
id  descricao           data_cadastro   valor_unitario  id_categorias
1   laranja umbigo      2022-05-10      13.90           1
2   beterraba organica  2022-05-12      4.00            2
3   polar               2022-06-20      3.70            4
4   coca-cola           2022-07-05      6.50            3

fornecedores
id  nome
1   Tiago
2   Carol
3   Ambeve
4   Andina

pedidos
id  data_pedido     id_fornecedor
1   2022-09-14      1
2   2022-09-14      2
3   2022-10-07      3
4   2022-12-10      4

pedidos_itens
quantidade  valor_unitario  id_pedido   id_produto
05          4.00            2           2
06          13.90           1           1
10          3.70            3           3
15          6.50            4           4
*/

--2. Lista os produtos que foram pedidos e o nome do fornecedor de cada pedido

SELECT p_i.id_produto, p.descricao as descricao, pd.id_fornecedor F.nome as fornecedores
from pedidos_itens p_i, produtos p, pedidos pd, fornecedores F 
WHERE p_i.id_produto=p.id AND 
      pd.id_fornecedor=F.id
      

--3.Mostre os produtos que já foram pedidos e o nome da categoria a que ele pertence.
select p_i.id_produto, p.descricao as descricao, p.id_categorias c.nome as categoria
from pedidos_itens p_i, pedidos pd, produtos p, categorias c
where p_i.id_produto=p.id AND 
      pd.id_categorias=c.id


--4.Mostre o nome do fornecedor, a data do último pedido e a descrição do produto que ele pediu.
select F.id, F.nome as nome, max(P.data_pedido) as data_ultimo_pedido, PDI.id_produto, P.descricao as descricao
from fornecedores F, pedidos PD, pedidos_itens PDI, produtos P 
where PD.id_fornecedor=F.id and 
      PDI.id_produto=P.id
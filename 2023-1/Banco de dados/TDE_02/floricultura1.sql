use floricultura;
create table clientes(
    id int AUTO_INCREMENT PRIMARY KEY not null,
    nome varchar(50) not null,
    endereco varchar(50),
    telefone varchar(15)
);

create table funcionarios(
    id int AUTO_INCREMENT PRIMARY KEY,
    nome varchar(50) not null ,
    endereco varchar(50) not null ,
    telefone varchar(15) not null,
    salario DECIMAL(10,2),
    cargo varchar(50)
);
create table pedidos(
  id int auto_increment primary key ,
  data date,
  status varchar(15),
  id_cliente int not null ,
  id_funcionario int not null,

  CONSTRAINT clientes_pedidos_fk
  FOREIGN KEY(id_cliente)
  REFERENCES clientes(id),

  CONSTRAINT funcionarios_pedidos_fk
  FOREIGN KEY (id_funcionario)
  REFERENCES funcionarios(id)
);

create table produtos_pedidos(
    id int auto_increment primary key ,
    descricao varchar(100),
    id_pedidos int not null,

    CONSTRAINT pedidos_produtos_pedidos_fk
    FOREIGN KEY (id_pedidos)
    REFERENCES pedidos(id)

);

create table produtos(
    id int auto_increment primary key ,
    nome varchar(20),
    valor decimal(10,2),
    id_produtos_pedidos int not null,
    id_pedidos int not null,

    constraint pedidos_produtos_produtos_fk
    foreign key (id_produtos_pedidos)
    references produtos_pedidos(id),

    constraint pedidos_produtos_fk
    foreign key (id_pedidos)
    references pedidos(id)

);

insert into clientes(nome,endereco,telefone)
values
    ('Caroline','Rua venus',99770896),
    ('Tiago','Rua faxinal',981795039),
    ('Amanda','Rua castelo branco',995415618);

select id,nome, endereco,telefone
from clientes;

insert into funcionarios(nome, endereco, telefone, salario, cargo)
values
    ('Carla','Rua cocal',997708986,2.000,'caixa'),
    ('Geovane','Rua cardoso',956495039,1.500,'atendente'),
    ('Pedro','Rua castelo branco',9954176518,3.000,'Gerente');

select id,nome, endereco, telefone, salario, cargo
from funcionarios;

insert into pedidos(data, status, id_cliente, id_funcionario)
values
    ('2021-02-21','separando',2,1 ),
    ('2023-03-07','finalizado',1,2 ),
    ('2023-03-08','aguardando',3,3 );

select id, data, status, id_cliente, id_funcionario
    from pedidos;

insert into produtos_pedidos( descricao, id_pedidos)
values
    ('rosas vermelhas',3 ),
    ('ipê',2 ),
    ('samambaia',1 );

select id,descricao,id_pedidos
from produtos_pedidos;

insert into  produtos(nome,valor, id_produtos_pedidos, id_pedidos)
values
    ('rosas', 14.00,1,2),
     ('ipê roxo', 100.00,3,1),
      ('samambaia', 14.00,2,3);

 select id,nome,valor,id_produtos_pedidos, id_pedidos
from produtos;

/* Saber o status dos pedidos de cada cliente e os funcionários responsáveis por eles*/
SELECT pedidos.id, clientes.nome, funcionarios.nome, pedidos.status
FROM pedidos
INNER JOIN clientes ON pedidos.id_cliente = clientes.id
INNER JOIN funcionarios ON pedidos.id_funcionario = funcionarios.id;

/*media dos salários*/
select avg(salario) AS media_salarios
from funcionarios;

/*salário mais ato e o nome do funcionário com salário mais alto*/
select nome, salario
from funcionarios
order by salario
desc limit 1

/*listando produto mais caro, em qual pedido ele está e a qual cliente pertence*/
SELECT produtos.nome AS nome_produto, produtos.valor AS valor_produto, pedidos.id AS id_pedido, clientes.nome AS nome_cliente
FROM produtos
  INNER JOIN produtos_pedidos ON produtos.id = produtos_pedidos.id
  INNER JOIN pedidos ON produtos_pedidos.id_pedidos = pedidos.id
  INNER JOIN clientes ON pedidos.id_cliente = clientes.id
ORDER BY produtos.valor DESC
LIMIT 1;

alter table pedidos
add column total decimal(10,3)

insert into pedidos(data, status,total, id_cliente, id_funcionario)
values
    ('2021-02-21','separando',350.00,2,1 ),
    ('2023-03-07','finalizado',500.00,1,2 ),
    ('2023-03-08','aguardando',150.00,3,3 );


select id, data, status,total, id_cliente, id_funcionario
    from pedidos;

/*selecionar funcionario com pedido mais que 100*/

select id_funcionario, sum(total) as total_vendas
from pedidos
group by id_funcionario
having total > 100;

/* quantidade de pedidos por cliente*/
select clientes.nome, count(pedidos.id) as total_pedidos
from clientes
    left join pedidos on clientes.id =pedidos.id_cliente
group by clientes.id;

/* VALOR TOTAL DOS PEDIDOS DE CADA CLIENTE*/
SELECT clientes.nome,SUM(produtos.valor) AS valor_total_pedidos
FROM clientes
  LEFT JOIN  pedidos ON clientes.id = pedidos.id_cliente
  LEFT JOIN produtos ON pedidos.id = produtos.id_pedidos
GROUP BY
  clientes.id;
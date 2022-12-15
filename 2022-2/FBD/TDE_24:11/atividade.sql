/*Faça uma modelagem com 3 tabelas que de condições de extrair os dados usando:
----
- função de agregação (minimo 2. ex. Sum, count)
- joins
- group by
- having
 
Pode fazer em grupo mas todos entregam a sua versão.
 
Vamos compartilhar a tela e mostrar em aula.*/


create table socios(
    numero int auto_increment primary key,
    nome varchar(40) not null,
    descricao_tipo_socios varchar(300) not null,
    endereco varchar(50) not null,
    codigo_tipo_socio varchar (50)not null
);

create table servicos(
    codigo_servico int primary key not null,
    descricao varchar(300) not null,
    valor_pago decimal (12,2) not null
);

create table socios_servicos(
    data date not null,
    codigo_servico int not null,
    valor decimal(12,2) not null,
    numero_socio int not null,
    constraint socios_fk_socios_servicos
        foreign key (numero_socio) references socios(numero),
    constraint servicos_fk_socios_servicos
        foreign key (codigo_servico) references servicos(codigo_servico)
  on update CASCADE
  on delete RESTRICT
);

--Acrescentando 10% no valor do serviço pago >= 100.
SELECT valor_pago * 1.10 as novo_valor_pago
from  servicos 
where valor_pago >= 100.00;

--Quantidade sócios que contrataram serviços
select numero_socio, count(codigo_servico) as quantos
from socios_servicos
group by numero_socio
having quantos >=1

--A soma dos valores dos serviços contratados a partir do mês de janeiro de 2022 até a presente data.
select SUM(valor) as soma
from socios_servicos
WHERE data >= '2022-01-01' and data < CURRENT_DATE;


-- A soma dos valores dos serviços contratados a partir do mês janeiro até 15 de fevereiro de 2022.
select SUM(valor) as soma
from socios_servicos
WHERE data >= '2022-01-01' and data <= '2022-02-15';

--Usando o Inner Join, mostrar o nome do sócio e valor gasto por ele até a presente data.
SELECT s.numero, s.nome as nome_socio, ss.valor as valor_gasto
from socios s
		inner join socios_servicos ss on ss.numero_socio = s.numero

where data < CURRENT_DATE;

-- Mostrar nome do sócio que contratou o serviço no mês de janeiro e o valor gasto neste período por ele.
SELECT s.nome as nome_socio, ss.valor as valor_gasto
from socios s
		inner join socios_servicos ss on ss.numero_socio = s.numero

where data >='2022-01-01' and data <='2022-01-31';
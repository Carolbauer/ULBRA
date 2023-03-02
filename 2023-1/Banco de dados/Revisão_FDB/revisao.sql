create TABLE cidades (
  codcid int AUTO_INCREMENT PRIMARY KEY,
  nome varchar(20) NOT NULL,
  uf varchar(2) NOT NULL
  );

  CREATE table filiais(
  codfilial int AUTO_INCREMENT PRIMARY key,
  nome varchar(100) not null,
  endereco varchar(100) not null,
  codcid int NOT null,
  
  CONSTRAINT codcid_cidade_fk
  FOREIGN KEY (codcid)
  REFERENCES Cidade(codcid)

  on delete restrict
  on update cascade
  );
  
  create table empregados(
  codemp varchar(10) PRIMARY key, 
  nome varchar(100) not null,
  endereco varchar(100) not null, 
  ct varchar(20) NOT NULL,
  rg varchar(20), 
  cpf varchar(11) not null, 
  salario int not null,
  codfilial int not null,
  codcid int not null,
  
  CONSTRAINT cidade_empregados_fk
  FOREIGN KEY(codcid)
  REFERENCES cidades(codcid),
  
  CONSTRAINT filial_empregados_fk
  FOREIGN KEY(codfilial)
  REFERENCES filiais(codfilial)
);

create table produtos
(
	cod_prod int auto_increment primary key,
    descricao varchar(100) not null,
    preco decimal(12,2) not null,
    nome_categoria varchar(100) not null,
    descricao_categoria varchar(100) not null
);

create table vendas
(
	cod_prod int not null,
    codfilial  int not null,
    constraint produtos_vendas_fk
	foreign key(cod_prod) 
	references produtos(cod_prod),
    
	constraint filiais_vendas_fk
	foreign key(codfilial) 
    references filiais(codfilial)
    
	on delete restrict
	on update cascade
);

insert into produtos(descricao, preco, nome_categoria, descricao_categoria) 
VALUES (' Macbook Air 2020', 1200.00, 'Eletrônicos', 'tecnologia'),
('Microondas', 350.00, 'Eletrodomésticos', 'cozinha'), ('Alexa', 700.00, 'Eletrônicos','tecnologia');

Select max(preco)
from produtos;

insert into cidades(nome, uf) 
values('Capão da canoa', 'RS'), ('Criciúma', 'SC'), ('Caxias do Sul', 'RS');


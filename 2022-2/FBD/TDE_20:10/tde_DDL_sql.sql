create table fornecedores(
    codigo int auto_increment not null primary key,
    nome  varchar(100) not null
);

create table categoria(
    codigo int not null primary key,
     nome varchar (100) not null
);

create table produtos(
codigo int auto_increment not null primary key, 
descricao varchar(100) not null, 
data_cadastro date, 
valor_unitario float not null,
codigo_categoria int not null,
constraint fk_categoria_produtos
        foreign key(codigo_categoria) REFERENCES categoria(codigo)
        on delete cascade
        on update restrict
);

create table pede(
    quantidade int auto_increment not null primary key, 
    valor_unitario float not null, 
    data date not null,
    codigo_fornecedor int not null,
    codigo_produto int not null,
    constraint fk_fornecedores_pede
        foreign key(codigo_fornecedor) REFERENCES fornecedores(codigo),
    constraint fk_produtos_pede
        foreign key(codigo_produto) REFERENCES produtos(codigo)
);


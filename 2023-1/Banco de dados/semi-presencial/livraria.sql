use livraria;
CREATE TABLE Clientes (
    id INT PRIMARY KEY auto_increment not null,
    nome VARCHAR(50) not null
);

CREATE TABLE Livros (
    id INT PRIMARY KEY auto_increment not null,
    titulo VARCHAR(100) not null ,
    valor_unit DECIMAL(10,2)
);

CREATE TABLE Autores (
    id INT PRIMARY KEY auto_increment not null,
    nome VARCHAR(50) not null
);

CREATE TABLE Autores_Livros (
    id_autor INT not null ,
    id_livro INT not null ,
    constraint Autores_fk_Autores_livros
         FOREIGN KEY (id_autor) REFERENCES Autores(id)
                on update cascade
                on delete restrict ,
    constraint Livros_fk_Autores_livros
        FOREIGN KEY (id_livro) REFERENCES Livros(id)
                on update cascade
                on delete restrict
);

CREATE TABLE Vendas (
    id INT PRIMARY KEY auto_increment not null ,
    data DATE not null ,
    id_cliente INT not null ,
    constraint Clientes_fk_Vendas
        FOREIGN KEY (id_cliente) REFERENCES Clientes(id)
                on update cascade
                on delete restrict
);

CREATE TABLE Vendas_Livros (
    id INT PRIMARY KEY auto_increment not null ,
    id_livro INT not null ,
    id_venda INT not null,
    qtd INT not null ,
    valor_unit DECIMAL(10,2),
    constraint Livros_fk_Vendas_Livros
        FOREIGN KEY (id_livro) REFERENCES Livros(id)
                on update cascade
                on delete restrict,
    constraint Vendas_fk_Vendas_Livros
         FOREIGN KEY (id_venda) REFERENCES Vendas(id)
                on update cascade
                on delete restrict
);


INSERT INTO Clientes (nome) VALUES
    ('João da Silva'),
    ( 'Mariana Souza'),
    ('Pedro Bauer');

INSERT INTO Livros (titulo, valor_unit) VALUES
    ('O Senhor dos Anéis', 49.90),
    ('Harry Potter e a Pedra Filosofal', 29.99),
    ('1984', 19.90),
    ('A Revolução dos Bichos', 14.99);

INSERT INTO Autores ( nome) VALUES
    ( 'J.R.R. Tolkien'),
    ('J.K. Rowling'),
    ('George Orwell'),
    ('R.S, Tolkien');

INSERT INTO Vendas ( data, id_cliente) VALUES
    ('2022-03-15', 1),
    ('2022-03-16', 2),
    ('2022-03-17', 3),
    ('2022-03-18', 1);

INSERT INTO Vendas_Livros ( id_livro,id_venda, qtd, valor_unit) VALUES
    ( 1, 3,2, 49.90),
    ( 2, 4,1, 19.90),
    ( 2,1, 1, 29.99),
    ( 4,2, 3, 14.99),
    ( 1,4, 1, 49.90),
    ( 2,3, 2, 29.99);

INSERT INTO Autores_Livros (id_autor, id_livro) VALUES
    (1, 1),
    (1, 4),
    (2, 2),
    (3, 3);

  /*Crie uma view chamada "livros_mais_vendidos" que exiba o título, autor,
      preço e a quantidade de vezes que cada livro foi vendido.*/
create view livros_mais_vendidos AS
select l.titulo AS nome_livro, a.nome as nome_autor, vl.valor_unit as preco,
       sum(vl.qtd) AS quantidade_vendas
    from Livros l
        inner join Autores_Livros al on l.id = al.id_livro
        inner join Vendas_Livros vl on l.id = vl.id_livro
        inner join Autores a on al.id_autor = a.id
            group by l.titulo
            order by quantidade_vendas desc;

/*Crie uma view que lista os autores que nunca venderam livros.*/
CREATE VIEW autores_sem_vendas AS
    SELECT a.nome as nome_autor
        FROM Autores a
            where not exists(
                 select *
                    from Autores_Livros al
                        inner join Vendas_Livros vl on al.id_livro = vl.id_livro
                            WHERE al.id_autor = a.id
        );
/* listar os livros que cada cliente comprou*/
create view livros_clientes_compras AS
    select c.nome as nome_cliente, l.titulo as nome_livro
        from Clientes c
            inner join Vendas v on c.id = v.id_cliente
            inner join Vendas_Livros vl on v.id = vl.id_venda
            inner join Livros l on vl.id_livro - l.id
                order by nome_cliente




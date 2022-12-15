CREATE TABLE cidades(
    id int primary key not null,
    nome varchar(100) not null,
    uf varchar(2) not null
);

CREATE TABLE professores(
    id int primary key not null,
    nome varchar(100) not null,
    email varchar(100) not null,
    endereco varchar(100) not null,
    cpf varchar(11) not null,
    idcid int not null,

    CONSTRAINT idcid_profs_fk
    FOREIGN KEY (idcid)
    REFERENCES cidades(id)
);

CREATE TABLE alunos(
    id int not null PRIMARY key,
    nome varchar(100) not null,
    endereco varchar(100) not null,
    telefone varchar(13) not null,
    idcid int not null,

    CONSTRAINT idcid_alunos_fk
        FOREIGN KEY (idcid)
            REFERENCES cidades(id)
);

CREATE TABLE cursos(
    id int not null PRIMARY KEY,
    nome_curso varchar(100) not null,
    valor_credito int not null
);

CREATE TABLE disciplinas(
    id int not null PRIMARY key,
    nome varchar(100) not null
);

CREATE TABLE turmas(
    id int not null PRIMARY key,
    sala int not null,
    capacidade int not null,
    idcurso INT not null,
    idprof INT not null,

    CONSTRAINT idcurso_turmas_fk
    FOREIGN KEY (idcurso)
    REFERENCES cursos(id),

    CONSTRAINT idprof_turmas_fk
    FOREIGN KEY (idprof)
    REFERENCES professores(id)
);

CREATE TABLE turdisc(
    idturma int not null,
    iddisc int not null,

    CONSTRAINT idturma_turdisc_fk
    FOREIGN KEY (idturma)
    REFERENCES turmas(id),

    CONSTRAINT iddisc_turdisc_fk
    FOREIGN KEY (iddisc)
    REFERENCES disciplinas(id)
);

CREATE TABLE matriculas(
    idaluno int not null,
    idturma int not null,

    CONSTRAINT idaluno_matr_fk
    FOREIGN KEY (idaluno)
    REFERENCES alunos(id),

    CONSTRAINT idturma_matr_fk
    FOREIGN KEY (idturma)
    REFERENCES turmas(id)
);

INSERT INTO cidades(id,nome, uf)
VALUES  (1,'Torres', 'RS'),
        (2,'Curitiba', 'PR'),
        (3,'Porto Alegre', 'RS'),
        (4,'São Leopoldo', 'RS'),
        (5,'Natal', 'RN'),
        (6,'Florianopólis', 'SC'),
        (7,'Blumenau', 'SC'),
        (8,'Brusque','SC'),
        (9,'Capão da Canoa', 'RS'),
        (10,'Arroio do Sal', 'RS');
SELECT id,nome, uf
from cidades

INSERT INTO professores(id,nome, email, endereco, cpf, idcid)
VALUES  (1,'Paulo', 'Paulo@gmail.com', 'Rua margarida', 1234567891, 1),
        (2,'Ramon', 'ramon@gmail.com', 'Rua grande faxinal', 1029384756, 1),
        (3,'Lucas', 'lucasf@hotmail.com', 'Rua benedet', 0132637565, 10),
        (4,'Vinicius', 'vinicius@gmail.com', 'Rua general osorio', 9029376756, 9),
        (5,'Cassio', 'cassio@gmail.com', 'Rua cincinato borges', 01085634129, 1)
select id,nome, email, endereco, cpf, idcid
from professores

     INSERT INTO alunos(id,nome,endereco,telefone,idcid)
VALUES  (1,'Caroline','Rua venus',99770896,9),
        (2,'Tiago','Rua faxinal',981795039,1),
        (3,'Leticia','Rua assis brasil',995506546,8),
        (4,'José','Rua vinte',991987409,4),
        (5,'João','Rua maracana',998065437,1),
        (6,'Gustavo','Rua leopoldo',995088589,5),
        (7,'Amanda','Rua castelo branco',995415618,1);

SELECT id,nome,endereco,telefone,idcid
from alunos

INSERT INTO cursos (id,nome_curso, valor_credito)
VALUES  (1,'Análise e Desenvolvimento de Sistemas',37.5),
        (2,'Administração', 30.00),
        (3,'Medicina', 200.00),
        (4,'Fisioterapia', 50.00),
        (5,'Enfermagem', 50.00),
        (6,'Estética e cosmética', 30.00)
        
        SELECT id,nome_curso, valor_credito
        from cursos

INSERT INTO disciplinas(id,nome)
VALUES  (1,'Fundamento de Banco de Dados'), 
        (2,'Programação web'),
        (3,'algoritmos'),
        (4,'cultura religiosa'),
        (6,'Comunicação e Expressão')
        
SELECT id, nome
from disciplinas

        INSERT INTO turmas(id,sala, capacidade, idcurso, idprof)
VALUES  (1, 316, 25, 1,3),
        (2, 318, 30, 3,5),
        (3, 325, 25, 1,2),
       	(4, 319, 25, 1,1),
        (5, 325, 25, 1,4);

SELECT id,sala, capacidade, idcurso, idprof
from turmas

INSERT INTO turdisc(idturma,iddisc)
VALUES  (1,2),
        (2,1),
        (3,4),
        (4,3);
insert into matriculas(idaluno, idturma)
values(1,1),
	  (2,1),
      (4,3),
      (2,2),
      (5,1);
 SELECT idaluno, idturma
 from matriculas
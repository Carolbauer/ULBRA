CREATE TABLE colaboradores(
    matricula INT auto_increment PRIMARY KEY, 
    senha VARCHAR(20) NOT NULL,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(50) NOT NULL
);

CREATE TABLE cordenadores(
    id INT auto_increment PRIMARY KEY,
    matricula_colaborador INT NOT NULL,
    CONSTRAINT fk_colaboradores_cordenadores
        FOREIGN KEY(matricula_colaborador) REFERENCES colaboradores(matricula)
);

CREATE TABLE projetos(
    id INT auto_increment PRIMARY KEY, 
    nome VARCHAR(100) NOT NULL,
    cordenador_id INT NOT NULL,
    CONSTRAINT fk_cordenadores_projetos
        FOREIGN KEY(cordenador_id) REFERENCES cordenadores(id)
);

CREATE TABLE comentarios(
    id INT auto_increment PRIMARY KEY,
    data_criacao DATE,
    projeto_id INT NOT NULL,
    matricula_colaborador INT NOT NULL,
    CONSTRAINT fk_projetos_comentarios
        FOREIGN KEY(projeto_id) REFERENCES projetos(id),
    CONSTRAINT fk_colaboradores_comentarios
        FOREIGN KEY(matricula_colaborador) REFERENCES colaboradores(matricula)
);

CREATE TABLE categoria_social(
    id INT auto_increment PRIMARY KEY,
    projeto_social_id INT NOT NULL,
    CONSTRAINT fk_projetos_categoria_social
        FOREIGN KEY(projeto_social_id) REFERENCES projetos(id),
);

CREATE TABLE categoria_melhoria_processo(
    id INT auto_increment PRIMARY KEY,
    projeto_melhoria_processo_id INT NOT NULL,
    CONSTRAINT fk_projeto_categoria_melhoria
        FOREIGN KEY(projeto_melhoria_processo_id) REFERENCES projetos(id)
);
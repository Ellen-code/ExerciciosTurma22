CREATE DATABASE db_escola;

USE db_escola;

CREATE TABLE tb_alunos(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    idade BIGINT(2),
    turma BIGINT(3),
    ano BIGINT(1),
    nota DECIMAL(3,2) NOT NULL,
    PRIMARY KEY (id)
);


INSERT INTO tb_alunos(nome, idade, turma, ano, nota) VALUES("José", 15, 20, 8, 4.00);
INSERT INTO tb_alunos(nome, idade, turma, ano, nota) VALUES("Maria", 11, 10, 6, 8.00);
INSERT INTO tb_alunos(nome, idade, turma, ano, nota) VALUES("João", 14, 20, 8, 7.00);
INSERT INTO tb_alunos(nome, idade, turma, ano, nota) VALUES("Clara", 13, 19, 7, 9.00);

SELECT * FROM tb_alunos;
SELECT * FROM tb_alunos WHERE nota  > 7;
SELECT * FROM tb_alunos WHERE nota  < 7;

UPDATE tb_alunos SET nota = 8.00 WHERE id = 1;

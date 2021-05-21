CREATE DATABASE db_rh;

USE db_rh;

CREATE TABLE tb_funcionarios(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    cpf DECIMAL,
    departamento VARCHAR(255),
    funcao VARCHAR(255),
    salario DECIMAL(6,2),
    PRIMARY KEY (id)
);

INSERT INTO tb_funcionarios(nome, cpf, departamento, funcao, salario) VALUES("Rita", 777777777-77, "Projetos", "Scrum Master", 5.0000);
INSERT INTO tb_funcionarios(nome, cpf, departamento, funcao, salario) VALUES("Lais", 888888888-88, "UX", "UX Writer", 3.0000);
INSERT INTO tb_funcionarios(nome, cpf, departamento, funcao, salario) VALUES("Rosa", 999999999-99, "CEO", "Diretoria", 20.0000);

SELECT * FROM tb_funcionarios;
SELECT * FROM tb_funcionarios WHERE salario > 2.000;
SELECT * FROM tb_funcionarios WHERE salario < 2.000;

UPDATE tb_funcionarios SET salario = 4.000 WHERE id = 2;
DELETE FROM tb_funcionarios WHERE id = 6;
ALTER TABLE tb_funcionarios MODIFY salario DECIMAL (6,3);


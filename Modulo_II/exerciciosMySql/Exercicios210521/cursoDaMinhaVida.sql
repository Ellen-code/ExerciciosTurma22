CREATE DATABASE db_cursoDaMinhaVida;

USE db_cursoDaMinhaVida;

CREATE TABLE tb_categoria(
	id BIGINT AUTO_INCREMENT,
    categoria ENUM('autoconhecimento', 'projetos', 'finanças'),
    PRIMARY KEY (id)
);

INSERT tb_categoria(categoria) VALUES ('autoconhecimento');
INSERT tb_categoria(categoria) VALUES ('projetos');
INSERT tb_categoria(categoria) VALUES ('finanças');

SELECT * FROM tb_categoria;

CREATE TABLE tb_curso(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR (255) NOT NULL,
    duracao VARCHAR(255),
    nivel VARCHAR(255),
    professore VARCHAR(255),
    investimento VARCHAR(255),
    categoria_id BIGINT,
    PRIMARY KEY (id),
    FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id)
);

INSERT INTO tb_curso(nome, duracao, nivel, professore, investimento, categoria_id) VALUES ('Propósito', 'Sempre que possível','Difícil', 'Motivação Interior','Recomendável', 1);
INSERT INTO tb_curso(nome, duracao, nivel, professore, investimento, categoria_id) VALUES ('Economia', 'Sempre','Difícil','Organização','Recomendável', 3);
INSERT INTO tb_curso(nome, duracao, nivel, professore, investimento, categoria_id) VALUES ('Se conhecer', 'Durante toda a vida', 'Difícil', 'Tempo','Super Recomendável', 1);
INSERT INTO tb_curso(nome, duracao, nivel, professore, investimento, categoria_id) VALUES ('Sonhar', 'Enquanto houver um novo dia','Fácil','Criatividade','Recomendável com os olhos abertos', 2);

SELECT * FROM tb_curso;
SELECT * FROM tb_curso WHERE investimento > 50.00;
SELECT * FROM tb_curso WHERE investimento BETWEEN 3.00 AND 60.00;
SELECT * FROM tb_curso WHERE nome LIKE "%J%";

SELECT tb_curso.nome, tb_curso.duracao, tb_curso.nivel, tb_curso.professore, tb_curso.investimento, tb_categoria.categoria
FROM tb_curso INNER JOIN tb_categoria ON tb_categoria.id = tb_curso.categoria_id;

SELECT * FROM tb_curso WHERE categoria_id = 1;
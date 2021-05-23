CREATE DATABASE db_cidade_das_frutas;

USE db_cidade_das_frutas;

CREATE TABLE tb_categoria(
	id BIGINT AUTO_INCREMENT,
    categoria ENUM('cítricas', 'doces', 'hídricas'),
    PRIMARY KEY (id)
);

INSERT INTO tb_categoria(categoria) VALUES ('cítricas');
INSERT INTO tb_categoria(categoria) VALUES ('doces');
INSERT INTO tb_categoria(categoria) VALUES ('hídricas');

SELECT * FROM tb_categoria;

CREATE TABLE tb_produtos(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    tipo VARCHAR(255) NOT NULL,
    melhorEpoca VARCHAR(255),
    precoUnidade DECIMAL(6,2) NOT NULL,
    quantidade BIGINT,
    categoria_id BIGINT,
    PRIMARY KEY (id),
    FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id)
);

INSERT INTO tb_produtos(nome, tipo, melhorEpoca, precoUnidade, quantidade, categoria_id) VALUES ('banana', 'prata', 'março-maio', 1.25, 4, 2);
INSERT INTO tb_produtos(nome, tipo, melhorEpoca, precoUnidade, quantidade, categoria_id) VALUES ('melancia', 'amarela', 'setembro-dezembro', 6.00, 1, 3);
INSERT INTO tb_produtos(nome, tipo, melhorEpoca, precoUnidade, quantidade, categoria_id) VALUES ('caju', 'comum', 'stembro-dezembro', 0.79, 8, 1);
INSERT INTO tb_produtos(nome, tipo, melhorEpoca, precoUnidade, quantidade, categoria_id) VALUES ('melão', 'amarelo', 'anual', 2.00, 2, 3);
INSERT INTO tb_produtos(nome, tipo, melhorEpoca, precoUnidade, quantidade, categoria_id) VALUES ('manga', 'espada', 'dezembro-fevereiro', 2.23, 2, 2);
INSERT INTO tb_produtos(nome, tipo, melhorEpoca, precoUnidade, quantidade, categoria_id) VALUES ('cupuaçu', 'mamorana', 'janeiro-maio', 8.00, 4, 1);
INSERT INTO tb_produtos(nome, tipo, melhorEpoca, precoUnidade, quantidade, categoria_id) VALUES ('mamão', 'papaia', 'setembro-janeiro', 4.18, 2, 2);
INSERT INTO tb_produtos(nome, tipo, melhorEpoca, precoUnidade, quantidade, categoria_id) VALUES ('abacaxi', 'pérola', 'novembro-dezembro', 6.29, 3, 1);

SELECT * FROM tb_produtos;
SELECT * FROM tb_produtos WHERE precoUnidade > 50.00;
SELECT * FROM tb_produtos WHERE precoUnidade BETWEEN 3.00 AND 60.00;
SELECT * FROM tb_produtos WHERE nome LIKE "%C%";

SELECT tb_produtos.nome, tb_produtos.tipo, tb_produtos.melhorEpoca, tb_produtos.precoUnidade, tb_produtos.quantidade, tb_categoria.categoria
FROM tb_produtos INNER JOIN tb_categoria ON tb_categoria.id = tb_produtos.categoria_id;

SELECT * FROM tb_produtos WHERE categoria_id = 2;
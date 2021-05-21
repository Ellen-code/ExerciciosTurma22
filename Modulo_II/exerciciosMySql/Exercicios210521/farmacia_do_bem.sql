CREATE DATABASE db_farmacia_do_bem;

USE db_farmacia_do_bem;

CREATE TABLE tb_categoria(
	id BIGINT AUTO_INCREMENT,
    categoria ENUM('antigripal', 'analgésico', 'antialérgico'),
    PRIMARY KEY (id)
);

INSERT INTO tb_categoria(categoria) VALUES ('antigripal');
INSERT INTO tb_categoria(categoria) VALUES ('analgésico');
INSERT INTO tb_categoria(categoria) VALUES ('antialérgico');

SELECT * FROM tb_categoria;

CREATE TABLE tb_produtos(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    quantidade bIGINT,
    tipo VARCHAR(255) NOT NULL,
    preco DECIMAL (6,2) NOT NULL,
    especificacao VARCHAR(255),
    categoria_id BIGINT,
    PRIMARY KEY (id),
    FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id)
);

INSERT INTO tb_produtos (nome, quantidade, tipo, preco, especificacao, categoria_id) VALUES ('Tylenol', 1, 'comprimido', 15.00, 'marca', 2);
INSERT INTO tb_produtos (nome, quantidade, tipo, preco, especificacao, categoria_id) VALUES ('Ibuprofeno', 2, 'comprimido', 25.00, 'genérico', 2);
INSERT INTO tb_produtos (nome, quantidade, tipo, preco, especificacao, categoria_id) VALUES ('Dipirona', 3, 'líquido', 20.00, 'genérico', 2);
INSERT INTO tb_produtos (nome, quantidade, tipo, preco, especificacao, categoria_id) VALUES ('Benegripe', 2, 'comprimido', 30.00, 'marca', 1);
INSERT INTO tb_produtos (nome, quantidade, tipo, preco, especificacao, categoria_id) VALUES ('Resfenol', 1, 'comprimido', 40.00, 'marca', 2); 
INSERT INTO tb_produtos (nome, quantidade, tipo, preco, especificacao, categoria_id) VALUES ('Loratadina', 2, 'líquido', 61.00, 'marca', 3);
INSERT INTO tb_produtos (nome, quantidade, tipo, preco, especificacao, categoria_id) VALUES ('Allegra', 1, 'comprimido', 20.00, 'marca', 3);

SELECT * FROM tb_produtos;
SELECT * FROM tb_produtos WHERE preco > 50.00;
SELECT * FROM tb_produtos WHERE preco BETWEEN 3.00 AND 60.00;
SELECT * FROM tb_produtos WHERE nome LIKE "%B%";

SELECT tb_produtos.nome, tb_produtos.quantidade, tb_produtos.tipo, tb_produtos.preco, tb_categoria.categoria
FROM tb_produtos INNER JOIN tb_categoria ON tb_categoria.id = tb_produtos.categoria_id;

SELECT * FROM tb_produtos WHERE categoria_id = 2;
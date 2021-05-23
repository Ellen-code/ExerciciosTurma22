CREATE DATABASE db_construindo_a_nossa_vida;

USE db_construindo_a_nossa_vida;

CREATE TABLE tb_categoria(
	id BIGINT AUTO_INCREMENT,
    categoria ENUM('hidráulicos', 'elétricos', 'fixadores'),
    PRIMARY KEY (id)
);

INSERT INTO tb_categoria(categoria) VALUES ('hidráulicos');
INSERT INTO tb_categoria(categoria) VALUES ('elétricos');
INSERT INTO tb_categoria(categoria) VALUES ('fixadores');

SELECT * FROM tb_categoria;

CREATE TABLE tb_produtos(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR (255) NOT NULL,
    tipo VARCHAR (255) NOT NULL,
    preco DECIMAL (6,2) NOT NULL,
    quantidade BIGINT,
    estoque BOOLEAN,
    categoria_id BIGINT,
    PRIMARY KEY (id),
    FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id)
);

INSERT INTO tb_produtos(nome, tipo, preco, quantidade, estoque, categoria_id) VALUES ('cabos','cobre', 275.00, 2, True, 2);
INSERT INTO tb_produtos(nome, tipo, preco, quantidade, estoque, categoria_id) VALUES ('parafusos','aço', 5.59, 10, True, 3);
INSERT INTO tb_produtos(nome, tipo, preco, quantidade, estoque, categoria_id) VALUES ('lâmpadas','led', 63.00 , 3, True, 2);
INSERT INTO tb_produtos(nome, tipo, preco, quantidade, estoque, categoria_id) VALUES ('chuveiro','aço inovidável', 140.00, 1, True, 1);
INSERT INTO tb_produtos(nome, tipo, preco, quantidade, estoque, categoria_id) VALUES ('pia','aço inox', 179.90, 0, False, 1);
INSERT INTO tb_produtos(nome, tipo, preco, quantidade, estoque, categoria_id) VALUES ('torneira','metal', 150.00, 0, False, 1);

SELECT * FROM tb_produtos;
SELECT * FROM tb_produtos WHERE preco > 50.00;
SELECT * FROM tb_produtos WHERE preco BETWEEN 3.00 AND 60.00;
SELECT * FROM tb_produtos WHERE nome LIKE "%C%";

SELECT tb_produtos.nome, tb_produtos.tipo, tb_produtos.preco, tb_produtos.quantidade, tb_produtos.estoque, tb_categoria.categoria
FROM tb_produtos INNER JOIN tb_categoria ON tb_categoria.id = tb_produtos.categoria_id;

SELECT * FROM tb_produtos WHERE categoria_id = 1;
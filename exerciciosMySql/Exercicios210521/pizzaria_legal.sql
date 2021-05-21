CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categoria(
	id BIGINT AUTO_INCREMENT,
    categoria ENUM('salgada', 'doce', 'brotinho'),
    PRIMARY KEY (id)
);

INSERT INTO tb_categoria(categoria) VALUES ('salgada');
INSERT INTO tb_categoria(categoria) VALUES ('doce');
INSERT INTO tb_categoria(categoria) VALUES ('brotinho');

SELECT * FROM tb_categoria;

CREATE TABLE tb_pizza(
	id BIGINT AUTO_INCREMENT,
    sabor VARCHAR(255) NOT NULL,
    borda VARCHAR(255) NOT NULL,
    preco DECIMAL(6,2) NOT NULL,
    quantidade BIGINT,
    acompanhamento VARCHAR(255),
    categoria_id BIGINT,
    PRIMARY KEY (id),
    FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id)
);

INSERT INTO tb_pizza (sabor, borda, preco, quantidade, acompanhamento, categoria_id) VALUES ("Marguerita", "Sim", 61.00, 2, "Refrigerante", 1);
INSERT INTO tb_pizza (sabor, borda, preco, quantidade, acompanhamento, categoria_id) VALUES ("Chocolate", "Não", 50.00, 1, "Refrigerante", 2);
INSERT INTO tb_pizza (sabor, borda, preco, quantidade, acompanhamento, categoria_id) VALUES ("Calabresa", "Sim", 46.00, 3, "Refrigerante", 3);
INSERT INTO tb_pizza (sabor, borda, preco, quantidade, acompanhamento, categoria_id) VALUES ("Portuguesa", "Sim", 60.00, 1, "Refrigerante", 1);
INSERT INTO tb_pizza (sabor, borda, preco, quantidade, acompanhamento, categoria_id) VALUES ("Doce de Leite", "Não", 49.00, 2, "Refrigerante", 2);
INSERT INTO tb_pizza (sabor, borda, preco, quantidade, acompanhamento, categoria_id) VALUES ("Mussarela", "Sim", 46.00, 1, "Refrigerante", 3);
INSERT INTO tb_pizza (sabor, borda, preco, quantidade, acompanhamento, categoria_id) VALUES ("Palmito", "Sim", 63.00, 1, "Refrigerante", 1);
INSERT INTO tb_pizza (sabor, borda, preco, quantidade, acompanhamento, categoria_id) VALUES ("Chocolate Branco", "Não", 50.00, 1, "Refrigerante", 2);

SELECT * FROM tb_pizza;
SELECT * FROM tb_pizza WHERE preco > 45.00;
SELECT * FROM tb_pizza WHERE sabor LIKE "%C%";

SELECT tb_pizza.sabor, tb_pizza.borda, tb_pizza.quantidade, tb_pizza.acompanhamento, tb_categoria.categoria
FROM tb_pizza INNER JOIN tb_categoria ON tb_categoria.id = tb_pizza.categoria_id; 

SELECT * FROM tb_pizza WHERE categoria_id = 1;



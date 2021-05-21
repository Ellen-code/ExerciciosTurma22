CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE tb_produtos(
	id BIGINT AUTO_INCREMENT,
    marca VARCHAR(255) NOT NULL,
    categoria VARCHAR(255) NOT NULL,
    quantidade BIGINT,
    preco DECIMAL(7,2) NOT NULL,
    tamanho VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
    );
    
    INSERT INTO tb_produtos(marca, categoria, quantidade, preco, tamanho) VALUES("Nike", "camiseta", 2, 400.00, "M");
    INSERT INTO tb_produtos(marca, categoria, quantidade, preco, tamanho) VALUES("Adidas", "calça", 1, 300.00, "P");
    INSERT INTO tb_produtos(marca, categoria, quantidade, preco, tamanho) VALUES("Puma", "jaqueta", 1, 502.00, "G");
    
    SELECT * FROM tb_produtos;
    SELECT * FROM tb_produtos WHERE preco > 500;
    SELECT * FROM tb_produtos WHERE preco < 500;
    
    UPDATE tb_produtos SET quantidade = 2 WHERE id = 2;
    ALTER TABLE tb_produtos MODIFY preco DECIMAL (6,2);
    
    

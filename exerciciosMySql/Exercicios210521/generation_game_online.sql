CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classe(
	id BIGINT AUTO_INCREMENT,
    classe ENUM('alquimista', 'justiceira', 'arqueira', 'dancarina'),
    PRIMARY KEY (id)
);
INSERT INTO tb_classe(classe) VALUES ('alquimista');
INSERT INTO tb_classe(classe) VALUES ('justiceira');
INSERT INTO tb_classe(classe) VALUES ('arqueira');
INSERT INTO tb_classe(classe) VALUES ('dancarina');

SELECT * FROM tb_classe;

CREATE TABLE tb_personagens(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    habilidade VARCHAR(255) NOT NULL,
    ataque BIGINT,
    defesa BIGINT,
    magia BIGINT,
    classe_id BIGINT,
    PRIMARY KEY (id),
    FOREIGN KEY (classe_id) REFERENCES tb_classe(id)
);

INSERT INTO tb_personagens (nome, habilidade, ataque, defesa, magia, classe_id) VALUES ("Arme", "Energia Explosiva", "1200", "80", "200", 1);
INSERT INTO tb_personagens (nome, habilidade, ataque, defesa, magia, classe_id) VALUES ("Lin", "Instaurar Paz", "2000", "60", "100", 2);
INSERT INTO tb_personagens (nome, habilidade, ataque, defesa, magia, classe_id) VALUES ("Lire", "Flechada Letal", "12000", "90", "300", 3);
INSERT INTO tb_personagens (nome, habilidade, ataque, defesa, magia, classe_id) VALUES ("Amy", "Cura", "4000", "100", "500", 4);

SELECT * FROM tb_personagens;
SELECT * FROM tb_personagens WHERE ataque > 2000;
SELECT * FROM tb_personagens WHERE defesa BETWEEN 1000 AND 2000;
SELECT * FROM tb_personagens WHERE nome LIKE "%A%";

SELECT tb_personagens.nome, tb_personagens.habilidade, tb_personagens.ataque, tb_personagens.defesa, tb_personagens.magia, tb_classe.classe
FROM tb_personagens INNER JOIN tb_classe ON tb_classe.id = tb_personagens.classe_id; 

SELECT * FROM tb_personagens WHERE classe_id = 3;

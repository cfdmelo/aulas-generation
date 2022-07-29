CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classes (
id BIGINT AUTO_INCREMENT,
classe_arqueiro BOOLEAN,
classe_guerreiro BOOLEAN,
classe_mago BOOLEAN,

PRIMARY KEY(ID)
);

CREATE TABLE tb_personagem (
id BIGINT AUTO_INCREMENT,
nome_personagem VARCHAR(255),
poder_de_ataque DECIMAL (7,2),
poder_de_defesa DECIMAL (7,2),
classes_id BIGINT,

PRIMARY KEY (ID),
FOREIGN KEY (classes_id) REFERENCES tb_classes(id)
);
CREATE DATABASE db_escola;
USE db_escola;
CREATE TABLE tb_dadosescola(
id_aluno BIGINT(5) AUTO_INCREMENT,
nome_aluno VARCHAR(10),
nota_aluno DECIMAL(2,1),
quantidade_faltas_aluno int (2),
aprovado BOOLEAN,

PRIMARY KEY(ID_aluno)
);


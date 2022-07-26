CREATE DATABASE e_commerce;
USE e_commerce;
CREATE TABLE tb_ecommerce(
id BIGINT AUTO_INCREMENT,
nome_produto VARCHAR(10),
marca_produto varchar(10),
preco_produto DECIMAL(6,2),
disponibilidade_produto BOOLEAN,

PRIMARY KEY(ID)
)
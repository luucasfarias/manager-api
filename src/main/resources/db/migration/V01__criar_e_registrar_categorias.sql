CREATE TABLE categoria (
codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(50) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO categoria(nome) VALUES('Lazer');
INSERT INTO categoria(nome) VALUES('Esporte');
INSERT INTO categoria(nome) VALUES('Manutencao');
INSERT INTO categoria(nome) VALUES('Condominio');
INSERT INTO categoria(nome) VALUES('Alimentacao');
INSERT INTO categoria(nome) VALUES('Saude');
INSERT INTO categoria(nome) VALUES('Emergencia');
INSERT INTO categoria(nome) VALUES('Outros');

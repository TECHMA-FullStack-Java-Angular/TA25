DROP table IF EXISTS fabricantes;
DROP table IF EXISTS articulos;

CREATE TABLE fabricantes (
    codigo INT auto_increment,
    nombre VARCHAR(100),
    CONSTRAINT PK_fabricantes PRIMARY KEY (codigo)
);

CREATE TABLE articulos (
    codigo INT auto_increment,
    nombre VARCHAR(100),
    precio INT,
    fabricante INT,
    CONSTRAINT PK_articulos PRIMARY KEY (codigo),
    CONSTRAINT FK_articulos_fabricantes FOREIGN KEY (fabricante) REFERENCES fabricantes(codigo)
);

insert into fabricantes (nombre)values('Fabricante1');
insert into fabricantes (nombre)values('Fabricante2');
insert into fabricantes (nombre)values('Fabricante3');
insert into articulos (nombre, precio, fabricante)values('Art1',25,1);
insert into articulos (nombre, precio, fabricante)values('Art2',10,2);
insert into articulos (nombre, precio, fabricante)values('Art3',100,3);

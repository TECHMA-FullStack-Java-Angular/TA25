DROP table IF EXISTS almacenes;
DROP table IF EXISTS cajas;

CREATE TABLE almacenes (
    codigo INT auto_increment,
    lugar VARCHAR(100),
    capacidad INT,
    CONSTRAINT PK_almacenes PRIMARY KEY (codigo)
);

CREATE TABLE cajas (
    num_referencia VARCHAR(5),
    contenido VARCHAR(100),
    valor int,
    almacen INT,
    CONSTRAINT PK_cajas PRIMARY KEY (num_referencia),
    CONSTRAINT FK_cajas_almacenes FOREIGN KEY (almacen) REFERENCES almacenes(codigo)
);


insert into almacenes (codigo,lugar, capacidad)values(1,'Barcelona',1000);
insert into almacenes (codigo,lugar, capacidad)values(2,'Madrid',2000);
insert into almacenes (codigo,lugar, capacidad)values(3,'Valencia',1500);
insert into cajas (num_referencia, contenido, valor, almacen)values('1A','shampoo',3,1);
insert into cajas (num_referencia, contenido, valor, almacen)values('2B','acondicionador',2,2);
insert into cajas (num_referencia, contenido, valor, almacen)values('3C','jabon',1,3);
DROP table IF EXISTS salas;
DROP table IF EXISTS peliculas;

CREATE TABLE peliculas (
    codigo INT auto_increment,
    nombre VARCHAR(100),
    calificacion_edad INT,
    CONSTRAINT PK_peliculas PRIMARY KEY (codigo)
);

CREATE TABLE salas (
    codigo INT auto_increment,
    nombre VARCHAR(100),
    pelicula int,
    CONSTRAINT PK_salas PRIMARY KEY (codigo),
    CONSTRAINT FK_salas_peliculas FOREIGN KEY (pelicula) REFERENCES peliculas(codigo)
);


insert into peliculas (codigo,nombre, calificacion_edad)values(1,'Peli1',18);
insert into peliculas (codigo,nombre, calificacion_edad)values(2,'Peli2',16);
insert into peliculas (codigo,nombre, calificacion_edad)values(3,'Peli3',7);
insert into salas (codigo, nombre, pelicula)values(1,'sala1',3);
insert into salas (codigo, nombre, pelicula)values(2,'sala2',2);
insert into salas (codigo, nombre, pelicula)values(3,'sala3',1);
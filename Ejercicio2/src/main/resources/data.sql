DROP table IF EXISTS empleados;
DROP table IF EXISTS departamentos;

CREATE TABLE departamentos (
    codigo INT,
    nombre VARCHAR(100),
    presupuesto INT,
    CONSTRAINT PK_departamentos PRIMARY KEY (codigo)
);

CREATE TABLE empleados (
    dni VARCHAR(8),
    nombre VARCHAR(100),
    apellidos VARCHAR(255),
    departamento INT,
    CONSTRAINT PK_empleados PRIMARY KEY (dni),
    CONSTRAINT FK_empleadoss_departamentos FOREIGN KEY (departamento) REFERENCES departamentos(codigo)
);


insert into departamentos (codigo,nombre, presupuesto)values(1,'Comercial',20000);
insert into departamentos(codigo, nombre,  presupuesto)values(2,'Legal',25000);
insert into departamentos (codigo, nombre, presupuesto)values(3,'Administrativo', 15000);
insert into empleados (dni, nombre, apellidos, departamento)values('1111111A','Empl1','Apell1',1);
insert into empleados (dni, nombre, apellidos, departamento)values('2222222B','Empl2','Apell2',2);
insert into empleados (dni, nombre, apellidos, departamento)values('3333333C','Empl3','Apell3',3);
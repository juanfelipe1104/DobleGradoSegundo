/*Crear la base de datos si no existe*/
CREATE DATABASE IF NOT EXISTS biblioteca;

/*Usar la base de datos*/
USE biblioteca;

/*Eliminar las tablas si existen*/
DROP TABLE IF EXISTS prestamo; 
DROP TABLE IF EXISTS ejemplar;
DROP TABLE IF EXISTS libro;
DROP TABLE IF EXISTS autor;
DROP TABLE IF EXISTS lector;

/*Crear las tablas*/
CREATE TABLE autor(
    id_autor INT NOT NULL AUTO_INCREMENT,
    nombre varchar(50),
    apellido varchar(50),
    PRIMARY KEY (id_autor)
);

CREATE TABLE libro(
    id_libro INT NOT NULL AUTO_INCREMENT,
    nombre varchar(50),
    tipo varchar(50),
    idioma varchar(50),
    tema varchar(50),
    id_libro_autor INT DEFAULT NULL,
    PRIMARY KEY (id_libro),
    FOREIGN KEY (id_libro_autor) REFERENCES autor (id_autor)
);

CREATE TABLE ejemplar(
    id_ejemplar INT NOT NULL AUTO_INCREMENT,
    id_ejemplar_libro INT DEFAULT NULL,
    PRIMARY KEY (id_ejemplar),
    FOREIGN KEY (id_ejemplar_libro) REFERENCES libro (id_libro)
);

CREATE TABLE lector(
    id_lector INT NOT NULL AUTO_INCREMENT,
    nombre varchar(50),
    apellido varchar(50),
    PRIMARY KEY (id_lector)
);

CREATE TABLE prestamo(
    id_prestamo INT NOT NULL AUTO_INCREMENT,
    id_prestamo_ejemplar INT NOT NULL,
    id_prestamo_lector INT NOT NULL,
    fecha DATE,
    PRIMARY KEY (id_prestamo),
    FOREIGN KEY (id_prestamo_ejemplar) REFERENCES ejemplar (id_ejemplar),
    FOREIGN KEY (id_prestamo_lector) REFERENCES lector (id_lector)
);

-- Insertar autores
INSERT INTO autor (id_autor, nombre, apellido) VALUES
(1, 'Gabriel', 'García Márquez'),
(2, 'J.K.', 'Rowling'),
(3, 'George', 'Orwell'),
(4, 'Isabel', 'Allende'),
(5, 'Miguel', 'Cervantes');

-- Insertar libros
INSERT INTO libro (id_libro, id_libro_autor, nombre, tipo, tema, idioma) VALUES
(1, 1, 'Cien Años de Soledad', 'Novela', 'Realismo mágico', 'Español'),
(2, 2, 'Harry Potter', 'Fantasía', 'Magia', 'Inglés'),
(3, 3, '1984', 'Distopía', 'Política', 'Inglés'),
(4, 4, 'La Casa de los Espíritus', 'Novela', 'Histórico', 'Español'),
(5, 5, 'Don Quijote', 'Novela', 'Aventura', 'Español');

-- Insertar ejemplares
INSERT INTO ejemplar (id_ejemplar, id_ejemplar_libro) VALUES
(1, 1), (2, 1), (3, 2), (4, 2), (5, 3),
(6, 3), (7, 4), (8, 4), (9, 5), (10, 5);

-- Insertar lectores
INSERT INTO lector (id_lector, nombre, apellido) VALUES
(1, 'Carlos', 'Pérez'),
(2, 'María', 'González'),
(3, 'Luis', 'Martínez'),
(4, 'Ana', 'Fernández'),
(5, 'Pedro', 'Rodríguez');

-- Insertar préstamos
INSERT INTO prestamo (id_prestamo_lector, id_prestamo_ejemplar, fecha) VALUES
(1, 1, '2024-02-01'),
(2, 3, '2024-02-02'),
(3, 5, '2024-02-03'),
(4, 7, '2024-02-04'),
(5, 9, '2024-02-05');
DROP DATABASE IF EXISTS biblioteca_universitaria;
CREATE DATABASE biblioteca_universitaria;

USE biblioteca_universitaria;

CREATE TABLE libro(
ID_libro INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
titulo VARCHAR(255),
autor VARCHAR(255),
editorial VARCHAR(255),
year_publicacion INT,
categoria VARCHAR(255),
ISBN VARCHAR(255) NOT NULL UNIQUE KEY,
total_ejemplares INT,
ejemplares_disponibles INT);

CREATE TABLE estudiante(
ID_estudiante INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(255),
email VARCHAR(255),
telefono VARCHAR(255),
carrera VARCHAR(255),
fecha_registro DATE);

CREATE TABLE prestamo(
ID_prestamo INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
ID_estudiante INT NOT NULL,
ID_libro INT NOT NULL,
fecha_prestamo DATE,
fecha_devolucion DATE,
estado VARCHAR(255),
FOREIGN KEY (ID_libro) REFERENCES libro(ID_libro)
ON UPDATE RESTRICT ON DELETE CASCADE,
FOREIGN KEY (ID_estudiante) REFERENCES estudiante(ID_estudiante)
ON UPDATE RESTRICT ON DELETE CASCADE);

CREATE TABLE usuario_biblioteca(
    ID_user int AUTO_INCREMENT PRIMARY KEY,
    nombre_user varchar(20),
    contraseña varchar(20),
    rol_usuario varchar(20)
);

CREATE TABLE multa(
    ID_multa int AUTO_INCREMENT PRIMARY KEY,
    usuarios_biblioteca_multas_id int,
    monto_multa int,
    fecha_generacion date,
    fecha_pago date,
    estado_multa varchar(20),
    FOREIGN KEY (usuarios_biblioteca_multas_id) REFERENCES usuario_biblioteca(ID_user) ON DELETE CASCADE
);

CREATE TABLE reserva(
    ID_reserva int AUTO_INCREMENT PRIMARY KEY,
    usuarios_biblioteca_reservas_id int,
    ID_libro_reserva INT,
    fecha_reserva date,
    estado_reserva varchar(20),
    FOREIGN KEY (usuarios_biblioteca_reservas_id) REFERENCES usuario_biblioteca(ID_user) ON UPDATE RESTRICT ON DELETE CASCADE,
    FOREIGN KEY (ID_libro_reserva) REFERENCES libro(ID_libro) ON UPDATE RESTRICT ON DELETE CASCADE
);

INSERT INTO libro (titulo, autor, editorial, year_publicacion, categoria, ISBN, total_ejemplares, ejemplares_disponibles) VALUES
('Cien años de soledad', 'Gabriel García Márquez', 'Sudamericana', 1967, 'Novela', '978-0307474728', 5, 3),
('1984', 'George Orwell', 'Secker & Warburg', 1949, 'Ciencia Ficción', '978-0451524935', 4, 2),
('El principito', 'Antoine de Saint-Exupéry', 'Reynal & Hitchcock', 1943, 'Fábula', '978-0156012195', 6, 4),
('Don Quijote de la Mancha', 'Miguel de Cervantes', 'Francisco de Robles', 1605, 'Novela', '978-0060934347', 3, 2),
('Harry Potter y la piedra filosofal', 'J.K. Rowling', 'Bloomsbury', 1997, 'Fantasía', '978-0747532699', 7, 5),
('Los juegos del hambre', 'Suzanne Collins', 'Scholastic Press', 2008, 'Distopía', '978-0439023481', 5, 3),
('El código Da Vinci', 'Dan Brown', 'Doubleday', 2003, 'Suspenso', '978-0385504201', 4, 2),
('Orgullo y prejuicio', 'Jane Austen', 'T. Egerton', 1813, 'Romance', '978-1503290563', 6, 4),
('Crimen y castigo', 'Fiódor Dostoyevski', 'The Russian Messenger', 1866, 'Novela', '978-0486415871', 3, 1),
('La sombra del viento', 'Carlos Ruiz Zafón', 'Planeta', 2001, 'Misterio', '978-8408079545', 5, 3);

INSERT INTO estudiante (nombre, email, telefono, carrera, fecha_registro) VALUES
('Juan Pérez', 'juan.perez@email.com', '1234567890', 'Ingeniería en Sistemas', '2024-01-15'),
('María Gómez', 'maria.gomez@email.com', '0987654321', 'Administración de Empresas', '2023-12-20'),
('Carlos López', 'carlos.lopez@email.com', '1122334455', 'Derecho', '2024-02-10'),
('Ana Martínez', 'ana.martinez@email.com', '6677889900', 'Medicina', '2024-01-30'),
('Pedro Sánchez', 'pedro.sanchez@email.com', '5566778899', 'Psicología', '2023-11-25'),
('Laura Fernández', 'laura.fernandez@email.com', '2233445566', 'Arquitectura', '2024-02-05'),
('Sergio Ramírez', 'sergio.ramirez@email.com', '7788990011', 'Contaduría', '2023-12-10'),
('Elena Torres', 'elena.torres@email.com', '3344556677', 'Diseño Gráfico', '2024-01-18'),
('Andrés Castro', 'andres.castro@email.com', '9900112233', 'Biología', '2023-12-15'),
('Sofía Herrera', 'sofia.herrera@email.com', '4455667788', 'Historia', '2024-02-01');

INSERT INTO prestamo (ID_estudiante, ID_libro, fecha_prestamo, fecha_devolucion, estado) VALUES
(1, 3, '2024-03-01', '2024-03-15', 'Devuelto'),
(2, 5, '2024-02-20', '2024-03-06', 'Devuelto'),
(3, 2, '2024-03-05', '2024-03-19', 'Pendiente'),
(4, 7, '2024-03-10', '2024-03-24', 'Pendiente'),
(5, 1, '2024-02-28', '2024-03-14', 'Devuelto'),
(6, 4, '2024-03-02', '2024-03-16', 'Pendiente'),
(7, 6, '2024-02-25', '2024-03-11', 'Devuelto'),
(8, 9, '2024-03-08', '2024-03-22', 'Pendiente'),
(9, 8, '2024-03-04', '2024-03-18', 'Devuelto'),
(10, 10, '2024-03-06', '2024-03-20', 'Pendiente');

INSERT INTO usuario_biblioteca (nombre_user, contraseña, rol_usuario) VALUES
('admin1', 'pass123', 'Administrador'),
('admin2', 'pass456', 'Administrador'),
('bibliotecario1', 'biblio789', 'Bibliotecario'),
('bibliotecario2', 'biblio101', 'Bibliotecario'),
('usuario1', 'userpass1', 'Estudiante'),
('usuario2', 'userpass2', 'Estudiante'),
('usuario3', 'userpass3', 'Estudiante'),
('usuario4', 'userpass4', 'Estudiante'),
('usuario5', 'userpass5', 'Estudiante'),
('usuario6', 'userpass6', 'Estudiante');

INSERT INTO multa (usuarios_biblioteca_multas_id, monto_multa, fecha_generacion, fecha_pago, estado_multa) VALUES
(5, 50, '2024-03-01', '2024-03-10', 'Pagada'),
(6, 30, '2024-03-05', NULL, 'Pendiente'),
(7, 40, '2024-02-28', '2024-03-07', 'Pagada'),
(8, 60, '2024-03-02', NULL, 'Pendiente'),
(9, 25, '2024-02-20', '2024-02-28', 'Pagada'),
(10, 35, '2024-03-08', NULL, 'Pendiente'),
(5, 20, '2024-03-10', NULL, 'Pendiente'),
(6, 55, '2024-03-12', '2024-03-18', 'Pagada'),
(7, 45, '2024-03-03', NULL, 'Pendiente'),
(8, 50, '2024-02-25', '2024-03-05', 'Pagada');

INSERT INTO reserva (usuarios_biblioteca_reservas_id, ID_libro_reserva, fecha_reserva, estado_reserva) VALUES
(5, 1, '2024-03-01', 'Activa'),
(6, 2, '2024-03-05', 'Activa'),
(7, 3, '2024-02-28', 'Cancelada'),
(8, 4, '2024-03-02', 'Activa'),
(9, 5, '2024-02-20', 'Completada'),
(10, 6, '2024-03-08', 'Activa'),
(5, 7, '2024-03-10', 'Cancelada'),
(6, 8, '2024-03-12', 'Activa'),
(7, 9, '2024-03-03', 'Completada'),
(8, 10, '2024-02-25', 'Activa');


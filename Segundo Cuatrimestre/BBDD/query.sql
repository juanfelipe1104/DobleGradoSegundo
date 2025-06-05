/*CREATE DATABASE colegio;

USE colegio;

CREATE TABLE alumno(
	id_alumno INT NOT NULL,
	nombreAlumno varchar(50),
	altura INT,
	PRIMARY KEY(id_alumno)
);

INSERT INTO alumno (id_alumno, nombreAlumno, altura) VALUES 
(1, 'Antonio', 188),
(2, 'Maria', 201),
(3, 'Jesus', 176),
(4, 'Rosa', 170),
(5, 'Pedro', 155),
(6, 'Fernando', 187),
(7, 'Javier', 205),
(8, 'Lucia', 190),
(9, 'Alejandro', 191),
(10, 'Raquel', 172);
*/
/*
SELECT d.dept_name, COUNT(i.ID) as numeroProfesores FROM instructor i
JOIN department d ON i.dept_name = d.dept_name
GROUP BY d.dept_name
ORDER BY numeroProfesores DESC LIMIT 1;
*/
/*
SELECT s.room_number AS aulaMasUsada, COUNT(s.sec_id) AS cantidadDeUsos FROM section s
WHERE s.year = 2018
GROUP BY s.room_number
ORDER BY COUNT(s.sec_id) DESC
LIMIT 1;
*/
/*
SELECT c.course_id, d.dept_name FROM course c 
LEFT JOIN section s ON c.course_id = s.course_id
JOIN department d ON c.dept_name = d.dept_name
WHERE s.course_id IS NULL;
*/
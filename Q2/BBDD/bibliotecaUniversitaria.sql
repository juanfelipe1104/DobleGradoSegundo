CREATE ROLE admin_biblioteca, bibliotecario, estudiante;
/*
GRANT ALL ON biblioteca_universitaria.* TO admin_biblioteca
GRANT SELECT, INSERT, UPDATE, DELETE ON biblioteca_universitaria.multas TO bibliotecario;
GRANT SELECT, INSERT, UPDATE, DELETE ON biblioteca_universitaria.prestamos TO bibliotecario;
GRANT SELECT, INSERT, UPDATE, DELETE ON biblioteca_universitaria.reservas TO bibliotecario;
GRANT SELECT ON biblioteca_universitaria.libros TO estudiante;
FLUSH PRIVILEGES;
*/

SELECT nombre_user FROM usuario_biblioteca 
JOIN multas ON ID_user = usuarios_biblioteca_multas_id
WHERE estado_multa = 'Pendiente';
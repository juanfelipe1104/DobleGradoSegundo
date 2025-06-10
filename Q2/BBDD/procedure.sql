USE university;

DELIMITER $$
DROP PROCEDURE IF EXISTS listar_instructores
$$
CREATE PROCEDURE listar_instructores(IN gama VARCHAR(50))
BEGIN
    SELECT *
    FROM instructor i
    WHERE i.name = gama;
END 
$$

DELIMITER ;
CALL listar_instructores('Mozart');
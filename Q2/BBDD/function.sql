USE university;

DELIMITER $$
DROP FUNCTION IF EXISTS contar_instructores
$$
CREATE FUNCTION contar_instructores(gama VARCHAR(50))
    RETURNS INT UNSIGNED DETERMINISTIC
BEGIN
    DECLARE total INT UNSIGNED;

    SET total = (
        SELECT COUNT(*)
        FROM instructor i
        WHERE instructor = gama
    );

    RETURN total;
END

DELIMITER ;
SELECT contar_instructores('Mozart');
DELIMITER $$
DROP PROCEDURE IF EXISTS cruzar_info_empleado_oficina $$
CREATE PROCEDURE cruzar_info_empleado_oficina(IN gama INT)
BEGIN
    SELECT e.employeeNumber, e.firstName, e.lastName, e.email, e.jobTitle, o.city, o.country
    FROM employees e
    JOIN offices o ON e.officeCode = o.officeCode
    WHERE e.employeeNumber = gama;
END
$$
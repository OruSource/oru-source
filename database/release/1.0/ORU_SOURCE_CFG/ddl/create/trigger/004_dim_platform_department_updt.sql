DELIMITER //
CREATE TRIGGER dim_platform_department_updt BEFORE UPDATE 
ON dim_platform_department FOR EACH ROW 
BEGIN 
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER dim_unit_of_measurement_updt BEFORE UPDATE 
ON dim_unit_of_measurement FOR EACH ROW 
BEGIN 
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;

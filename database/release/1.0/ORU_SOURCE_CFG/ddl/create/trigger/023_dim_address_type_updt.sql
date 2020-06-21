DELIMITER //
CREATE TRIGGER dim_address_type_updt BEFORE UPDATE 
ON dim_address_type FOR EACH ROW 
BEGIN 
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;

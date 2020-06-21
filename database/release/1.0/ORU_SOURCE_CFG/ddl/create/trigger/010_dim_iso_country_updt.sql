DELIMITER //
CREATE TRIGGER dim_iso_country_updt BEFORE UPDATE 
ON dim_iso_country FOR EACH ROW 
BEGIN 
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;

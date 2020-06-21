DELIMITER //
CREATE TRIGGER dim_iso_currency_updt BEFORE UPDATE 
ON dim_iso_currency FOR EACH ROW 
BEGIN 
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER dim_general_terms_updt BEFORE UPDATE 
ON dim_general_terms FOR EACH ROW 
BEGIN 
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;

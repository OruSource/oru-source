DELIMITER //
CREATE TRIGGER supplier_details_updt BEFORE UPDATE 
ON supplier_details FOR EACH ROW 
BEGIN 
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;

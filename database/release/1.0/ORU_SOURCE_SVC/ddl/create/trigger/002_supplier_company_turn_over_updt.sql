DELIMITER //
CREATE TRIGGER supplier_company_turn_over_updt BEFORE UPDATE 
ON supplier_company_turn_over FOR EACH ROW 
BEGIN 
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;

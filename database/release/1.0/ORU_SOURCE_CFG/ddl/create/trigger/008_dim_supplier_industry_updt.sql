DELIMITER //
CREATE TRIGGER dim_supplier_industry_updt BEFORE UPDATE 
ON dim_supplier_industry FOR EACH ROW 
BEGIN 
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;

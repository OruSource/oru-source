DELIMITER //
CREATE TRIGGER dim_supplier_sector_updt BEFORE UPDATE 
ON dim_supplier_sector FOR EACH ROW 
BEGIN 
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;

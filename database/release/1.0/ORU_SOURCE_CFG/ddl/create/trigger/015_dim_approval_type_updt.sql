DELIMITER //
CREATE TRIGGER dim_approval_type_updt BEFORE UPDATE 
ON dim_approval_type FOR EACH ROW 
BEGIN 
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;

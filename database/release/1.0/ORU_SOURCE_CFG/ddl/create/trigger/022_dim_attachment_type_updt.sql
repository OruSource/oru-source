DELIMITER //
CREATE TRIGGER dim_attachment_type_updt BEFORE UPDATE 
ON dim_attachment_type FOR EACH ROW 
BEGIN 
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;

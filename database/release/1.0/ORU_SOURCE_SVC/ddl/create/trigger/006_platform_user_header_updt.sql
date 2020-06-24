DELIMITER //
CREATE TRIGGER platform_user_header_updt BEFORE UPDATE 
ON platform_user_header FOR EACH ROW 
BEGIN 
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;

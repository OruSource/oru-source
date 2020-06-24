DELIMITER //
CREATE TRIGGER platform_user_address_updt BEFORE UPDATE 
ON platform_user_address FOR EACH ROW 
BEGIN 
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;

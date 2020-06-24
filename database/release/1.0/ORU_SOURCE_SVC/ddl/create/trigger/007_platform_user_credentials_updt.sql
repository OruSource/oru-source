DELIMITER //
CREATE TRIGGER platform_user_credentials_updt BEFORE UPDATE 
ON platform_user_credentials FOR EACH ROW 
BEGIN 
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;

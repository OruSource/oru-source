DELIMITER //
CREATE TRIGGER dim_platform_user_roles_updt BEFORE UPDATE 
ON dim_platform_user_roles FOR EACH ROW 
BEGIN 
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;

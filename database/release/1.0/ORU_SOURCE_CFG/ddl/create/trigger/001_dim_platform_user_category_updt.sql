DELIMITER //
CREATE TRIGGER dim_platform_user_category_updt BEFORE UPDATE 
ON dim_platform_user_category FOR EACH ROW 
BEGIN 
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;

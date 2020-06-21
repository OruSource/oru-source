DELIMITER //
CREATE TRIGGER role_permission_map_updt BEFORE UPDATE 
ON role_permission_map FOR EACH ROW 
BEGIN 
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;

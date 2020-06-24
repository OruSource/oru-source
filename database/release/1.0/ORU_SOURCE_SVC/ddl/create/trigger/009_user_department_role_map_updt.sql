DELIMITER //
CREATE TRIGGER user_department_role_map_updt BEFORE UPDATE
ON user_department_role_map FOR EACH ROW
BEGIN
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;

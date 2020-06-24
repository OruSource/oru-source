DELIMITER //
CREATE TRIGGER platform_user_attachment_updt BEFORE UPDATE
ON platform_user_attachment FOR EACH ROW
BEGIN
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;

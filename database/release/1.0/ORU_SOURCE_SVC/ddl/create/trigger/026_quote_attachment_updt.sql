DELIMITER //
CREATE TRIGGER quote_attachment_updt BEFORE UPDATE
ON quote_attachment FOR EACH ROW
BEGIN
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;

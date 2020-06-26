DELIMITER //
CREATE TRIGGER purchase_request_attachment_updt BEFORE UPDATE
ON purchase_request_attachment FOR EACH ROW
BEGIN
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;

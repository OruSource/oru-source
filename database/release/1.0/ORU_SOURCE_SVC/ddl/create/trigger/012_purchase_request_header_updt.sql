DELIMITER //
CREATE TRIGGER purchase_request_header_updt BEFORE UPDATE
ON purchase_request_header FOR EACH ROW
BEGIN
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;

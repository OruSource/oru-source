DELIMITER //
CREATE TRIGGER request_for_quote_header_updt BEFORE UPDATE
ON request_for_quote_header FOR EACH ROW
BEGIN
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER customer_quote_attachment_updt BEFORE UPDATE
ON customer_quote_attachment FOR EACH ROW
BEGIN
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;

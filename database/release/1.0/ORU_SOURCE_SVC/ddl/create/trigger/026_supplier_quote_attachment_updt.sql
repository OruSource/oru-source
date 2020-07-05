DELIMITER //
CREATE TRIGGER supplier_quote_attachment_updt BEFORE UPDATE
ON supplier_quote_attachment FOR EACH ROW
BEGIN
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;

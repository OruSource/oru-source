DELIMITER //
CREATE TRIGGER supplier_quote_header_updt BEFORE UPDATE
ON supplier_quote_header FOR EACH ROW
BEGIN
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER supplier_terms_response_updt BEFORE UPDATE
ON supplier_terms_response FOR EACH ROW
BEGIN
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;
